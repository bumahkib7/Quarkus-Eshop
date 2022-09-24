/**
 * It's a service class that handles all the business logic for the Cart entity
 */
package com.codeninja.services;

import com.codeninja.DTO.CartDto;
import com.codeninja.Enum.CartStatus;
import com.codeninja.models.Cart;
import com.codeninja.repositories.CartRepository;
import com.codeninja.repositories.CustomerRepository;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static javax.transaction.Transactional.TxType.SUPPORTS;


@SuppressWarnings("ALL")
@Slf4j
@ApplicationScoped
@Transactional
public class CartService {
    // Injecting the CartRepository into the CartService class.
    @Inject
    CartRepository cartRepository;
    // Injecting the CustomerRepository into the CartService class.
    @Inject
    CustomerRepository customerRepository;

    /**
     * It takes a Cart object and returns a CartDto object
     *
     * @param cart the cart object that we want to map to a CartDto object
     * @return A CartDto object
     */
    public static CartDto mapToDto(Cart cart) {
        return new CartDto(
                cart.getId(),
                CustomerService.mapToDto(cart.getCustomer()),
                cart.getStatus().name()
        );

    }

    /**
     * Get all the carts from the database and map them to DTOs.
     *
     * @return A list of CartDto objects
     */
    public List<CartDto> findAll() {
        log.debug("Request to get all Carts");
        return this.cartRepository.findAll()
                .stream()
                .map(CartService::mapToDto)
                .collect(Collectors.toList());
    }

    /**
     * Find all the carts that have a status of NEW and map them to a CartDto
     *
     * @return A list of CartDto objects
     */
    public List<CartDto> findAllActiveCarts() {
        return this.cartRepository.findByStatus(CartStatus.NEW)
                .stream()
                .map(CartService::mapToDto)
                .collect(Collectors.toList());
    }

    /**
     * "If there is no active cart for the customer, create a new cart and return it."
     *
     * The first thing we do is check if there is an active cart for the customer. If there is, we throw an exception. If
     * there isn't, we create a new cart and return it
     *
     * @param customerId The id of the customer who owns the cart.
     * @return A new cart is being returned.
     */
    public Cart create(Long customerId) {
        if (this.getActiveCart(customerId) == null) {
            var customer =
                    this.customerRepository.findById(customerId)
                            .orElseThrow(() -> new IllegalStateException("The Customer does not exist !"));
            var cart = new Cart(customer, CartStatus.NEW);
            return this.cartRepository.save(cart);
        } else {
            throw new IllegalStateException("There is already an active cart");
        }
    }

    public CartDto createDto(Long customerId) {
        return mapToDto(this.create(customerId));
    }

    /**
     * > Find a cart by id and return it as a CartDto
     *
     * @param id The id of the cart to be retrieved.
     * @return A CartDto object
     */
    @Transactional(SUPPORTS)
    public CartDto findById(Long id) {
        log.debug("Request to get Cart : {}", id);
        return this.cartRepository.findById(id).map(CartService::mapToDto).
                orElse(null);
    }

    /**
     * When a cart is deleted, we set its status to CANCELED and save it.
     *
     * @param id The id of the cart to be deleted.
     */
    public void delete(Long id) {
        log.debug("Request to delete Cart : {}", id);
        Cart cart = this.cartRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Cannot find cart with id" + id));
        cart.setStatus(CartStatus.CANCELED);
        this.cartRepository.save(cart);
    }


    // Checking if there is an active cart for a customer.
    /**
     * > It returns the active cart for a given customer
     *
     * @param customerId The id of the customer who is trying to get the cart.
     * @return CartDto
     */
    public CartDto getActiveCart(Long customerId) {
        List<Cart> carts = this.cartRepository
                .findByStatusAndCustomerId(CartStatus.NEW, customerId);

        //cart shouldnt be null and should have only one element
        carts.stream().filter(Objects::nonNull)
                .filter(cart -> carts.size() == 1)
                .map(CartService::mapToDto)
                .findFirst().
                filter(cart -> carts.size() > 1)
                .ifPresent(cart -> {
                    throw new IllegalStateException("There is already an active cart");
                });

        return Optional.ofNullable(carts.get(0))
                .map(CartService::mapToDto)
                .orElse(null);
        // first of all cart shouldn't be empty
        //cart should only return 1 instance per user and not more
        //

        /*if (carts != null) {
            if (carts.size() == 1) {
                return mapToDto(carts.get(0));
            }
            if (carts.size() > 1) {
                throw new IllegalStateException("Many active carts detected !!!");
            }*/
    }

}

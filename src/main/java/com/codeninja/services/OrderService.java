package com.codeninja.services;

import com.codeninja.DTO.OrderDto;
import com.codeninja.DTO.OrderItemDto;
import com.codeninja.Enum.OrderStatus;
import com.codeninja.models.Cart;
import com.codeninja.models.Order;
import com.codeninja.repositories.CartRepository;
import com.codeninja.repositories.OrderRepository;
import com.codeninja.repositories.PaymentRepository;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
@Slf4j
@ApplicationScoped
@Transactional


public class OrderService {
    @Inject
    OrderRepository orderRepository;
    @Inject
    PaymentRepository paymentRepository;
    @Inject
    CartRepository cartRepository;

    public static OrderDto mapToDto(Order order) {
        Set<OrderItemDto> orderItems = order.getOrderItems()
                .stream().map(OrderItemService::mapToDto).
                collect(Collectors.toSet());
        return new OrderDto(

                order.getId(),
                order.getPrice(),
                order.getStatus().name(),
                order.getShipped(),
                order.getPayment() != null ? order.getPayment().getId() : null, AddressService.mapToDto(order.getShipmentAddress()), orderItems,
                CartService.mapToDto(order.getCart())

        );
    }

    public List<OrderDto> findAll() {
        log.debug("Request to get all Orders");
        return this.orderRepository.findAll().stream().
                map(OrderService::mapToDto)
                .collect(Collectors.toList());
    }

    public OrderDto findById(Long id) {
        log.debug("Request to get Order : {}", id);
        return this.orderRepository.findById(id)
                .map(OrderService::mapToDto).orElse(null);
    }

    public List<OrderDto> findAllByUser(Long id) {
        return this.orderRepository.findByCartCustomerId(id)
                .stream().map(OrderService::mapToDto).collect(Collectors.
                        toList());
    }

    public OrderDto create(OrderDto orderDto) {
        log.debug("Request to create Order : {}", orderDto);
        Long cartId = orderDto.getCart().getId();
        Cart cart = this.cartRepository.findById(cartId)
                .orElseThrow(() -> new IllegalStateException(
                        "The Cart with ID[" + cartId + "] was not found !"));
        return mapToDto(this.orderRepository.save(new Order(BigDecimal.ZERO, OrderStatus.CREATION, null, null,
                AddressService.createFromDto(orderDto.
                        getShipmentAddress()),
                Collections.emptySet(), cart)));
    }

    @Transactional
    public void delete(Long id) {
        log.debug("Request to delete Order : {}", id);
        Order order = this.orderRepository.findById(id)
                .orElseThrow(() ->
                        new IllegalStateException(
                                "Order with ID[" + id + "] cannot be found!"));
        Optional.ofNullable(order.getPayment())
                .ifPresent(paymentRepository::delete);
        orderRepository.delete(order);
    }

    public boolean existsById(Long id) {
        return this.orderRepository.existsById(id);
    }
}
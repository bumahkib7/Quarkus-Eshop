package com.codeninja.controllers;

import com.codeninja.DTO.CartDto;
import com.codeninja.services.CartService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("api/v1/carts")
public class CartResource {
    @Inject
    CartService cartService;

    /**
     * This function is a GET request that returns a list of CartDto objects
     *
     * @return A list of CartDto objects.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CartDto> findAll() {
        return this.cartService.findAll();
    }

    @GET
    @Path("/active")
    @Produces(MediaType.APPLICATION_JSON)
    public List<CartDto> findAllActiveCarts() {
        return this.cartService.findAllActiveCarts();
    }

    /**
     * Get the active cart for a customer.
     *
     * @param customerId The customer ID of the customer whose cart you want to retrieve.
     * @return A CartDto object
     */
    @GET
    @Path("/customer/{id}")
    public CartDto getActiveCartForCustomer(@PathParam("id") Long customerId) {
        return this.cartService.getActiveCart(customerId);
    }

    /**
     * > This function returns a CartDto object that is found by the id parameter
     *
     * @param id The id of the cart to be retrieved.
     * @return A CartDto object
     */
    @GET
    @Path("/{id}")
    public CartDto findById(@PathParam("id") Long id) {
        return this.cartService.findById(id);
    }

    // Creating a new cart for a customer.
    @POST
    @Path("/customer/{id}")
    public CartDto create(@PathParam("id") Long customerId) {
        return this.cartService.createDto(customerId);
    }

    /**
     * Delete the cart with the given id.
     *
     * @param id The id of the cart to delete.
     */
    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        this.cartService.delete(id);
    }
}
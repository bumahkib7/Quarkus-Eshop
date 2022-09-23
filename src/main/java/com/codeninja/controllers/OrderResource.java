package com.codeninja.controllers;

import com.codeninja.DTO.OrderDto;
import com.codeninja.services.OrderService;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;


@Path("api/v1/orders")
@Produces
public class OrderResource {
    @Inject
    OrderService orderService;
    @GET
    public List<OrderDto> findAll() {
        return this.orderService.findAll();
    }
    @GET
    @Path("/customer/{id}")
    public List<OrderDto> findAllByUser(@PathParam("id") Long id) {
        return this.orderService.findAllByUser(id);
    }
    @GET
    @Path("/{id}")
    public OrderDto findById(@PathParam("id") Long id) {
        return this.orderService.findById(id);
    }
    @POST
    @Consumes
    public OrderDto create(OrderDto orderDto) {
        return this.orderService.create(orderDto);
    }
    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        this.orderService.delete(id);
    }
    @GET
    @Path("/exists/{id}")
    public boolean existsById(@PathParam("id") Long id) {
        return this.orderService.existsById(id);
    }

}
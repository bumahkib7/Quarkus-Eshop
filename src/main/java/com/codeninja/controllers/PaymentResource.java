package com.codeninja.controllers;

import com.codeninja.DTO.PaymentDto;
import com.codeninja.services.PaymentService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Consumes(MediaType.APPLICATION_JSON)
@Path("api/v1/payments")
public class PaymentResource {
    @Inject
    PaymentService paymentService;

    @GET
    public List<PaymentDto> findAll() {
        return this.paymentService.findAll();
    }

    @GET
    @Path("/{id}")
    public PaymentDto findById(@PathParam("id") Long id) {
        return this.paymentService.findById(id);
    }

    @POST
    public PaymentDto create(PaymentDto orderItemDto) {
        return this.paymentService.create(orderItemDto);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        this.paymentService.delete(id);
    }

    @GET
    @Path("/price/{max}")
    public List<PaymentDto> findPaymentsByAmountRangeMax(@PathParam("max")
                                                         double max) {
        return this.paymentService.findByPriceRange(max);
    }
}
package com.codeninja.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.function.Consumer;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDto implements Consumer<Boolean> {
    private Long id;
    private CustomerDto customer;
    private String status;

    @Override
    public void accept(Boolean aBoolean) {
    }
}
package com.codeninja.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Getter
@NoArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "order_items")
public class OrderItem extends AbstractEntity {
    @NotNull
    @Column(name = "quantity", nullable = false)
    private Long quantity;
    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private Product product;
    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public OrderItem(@NotNull Long quantity, Product product, Order order) {
        this.quantity = quantity;
        this.product = product;
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(quantity, orderItem.quantity) &&
                Objects.equals(product, orderItem.product) &&
                Objects.equals(order, orderItem.order);
    }


    public int hashCode() {
        return Objects.hash(quantity, product, order);
    }
}
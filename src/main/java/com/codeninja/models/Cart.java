package com.codeninja.models;

import com.codeninja.Enum.CartStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "carts")
public class Cart extends AbstractEntity {

    @ManyToOne
    private final Customer customer;
    @NotNull
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private final CartStatus status;




    public Cart(Customer customer, CartStatus status) {

        this.customer = customer;
        this.status = status;
    }

    public Cart() {
        this.customer = null;
        this.status = null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(customer, cart.customer) &&
                status == cart.status;
    }
    @Override
    public int hashCode() {
        return Objects.hash(customer, status);
    }


    public void setStatus(CartStatus canceled) {
    }
}

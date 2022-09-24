package com.codeninja.repositories;

import com.codeninja.Enum.CartStatus;
import com.codeninja.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// Creating a repository for the Cart model.
@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    /**
     * Find all carts with a given status.
     *
     * @param status The status of the cart.
     * @return A list of Cart objects.
     */
    @Query("SELECT c FROM Cart c WHERE c.status = ?1")
    List<Cart> findByStatus(CartStatus status);



    /**
     * Find all carts with a given status and customer id.
     *
     * @param status The status of the cart.
     * @param customerId The id of the customer whose cart we want to find.
     * @return A list of Cart objects
     */
    @Query("SELECT c FROM Cart c WHERE c.status = ?1 AND c.customer.id = ?2")
    List<Cart> findByStatusAndCustomerId(CartStatus status, Long customerId);
}
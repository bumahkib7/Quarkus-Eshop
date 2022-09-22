package com.codeninja.controllers;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CartResourceTest {
    /**
     * Method under test: {@link CartResource#findAll()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindAll() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.services.CartService.findAll()" because "this.cartService" is null
        //       at com.codeninja.controllers.CartResource.findAll(CartResource.java:18)
        //   In order to prevent findAll()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findAll().
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CartResource()).findAll();
    }

    /**
     * Method under test: {@link CartResource#findAllActiveCarts()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindAllActiveCarts() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.services.CartService.findAllActiveCarts()" because "this.cartService" is null
        //       at com.codeninja.controllers.CartResource.findAllActiveCarts(CartResource.java:24)
        //   In order to prevent findAllActiveCarts()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findAllActiveCarts().
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CartResource()).findAllActiveCarts();
    }

    /**
     * Method under test: {@link CartResource#getActiveCartForCustomer(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetActiveCartForCustomer() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.services.CartService.getActiveCart(java.lang.Long)" because "this.cartService" is null
        //       at com.codeninja.controllers.CartResource.getActiveCartForCustomer(CartResource.java:30)
        //   In order to prevent getActiveCartForCustomer(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getActiveCartForCustomer(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CartResource()).getActiveCartForCustomer(123L);
    }

    /**
     * Method under test: {@link CartResource#findById(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.services.CartService.findById(java.lang.Long)" because "this.cartService" is null
        //       at com.codeninja.controllers.CartResource.findById(CartResource.java:36)
        //   In order to prevent findById(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findById(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CartResource()).findById(123L);
    }

    /**
     * Method under test: {@link CartResource#create(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.services.CartService.createDto(java.lang.Long)" because "this.cartService" is null
        //       at com.codeninja.controllers.CartResource.create(CartResource.java:42)
        //   In order to prevent create(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   create(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CartResource()).create(123L);
    }

    /**
     * Method under test: {@link CartResource#delete(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDelete() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.services.CartService.delete(java.lang.Long)" because "this.cartService" is null
        //       at com.codeninja.controllers.CartResource.delete(CartResource.java:48)
        //   In order to prevent delete(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   delete(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CartResource()).delete(123L);
    }
}


package com.codeninja.controllers;

import com.codeninja.DTO.OrderDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class OrderResourceTest {
    /**
     * Method under test: {@link OrderResource#findAll()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindAll() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.services.OrderService.findAll()" because "this.orderService" is null
        //       at com.codeninja.controllers.OrderResource.findAll(OrderResource.java:17)
        //   In order to prevent findAll()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findAll().
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new OrderResource()).findAll();
    }

    /**
     * Method under test: {@link OrderResource#findAllByUser(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindAllByUser() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.services.OrderService.findAllByUser(java.lang.Long)" because "this.orderService" is null
        //       at com.codeninja.controllers.OrderResource.findAllByUser(OrderResource.java:22)
        //   In order to prevent findAllByUser(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findAllByUser(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new OrderResource()).findAllByUser(123L);
    }

    /**
     * Method under test: {@link OrderResource#findById(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.services.OrderService.findById(java.lang.Long)" because "this.orderService" is null
        //       at com.codeninja.controllers.OrderResource.findById(OrderResource.java:27)
        //   In order to prevent findById(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findById(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new OrderResource()).findById(123L);
    }

    /**
     * Method under test: {@link OrderResource#create(OrderDto)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.services.OrderService.create(com.codeninja.DTO.OrderDto)" because "this.orderService" is null
        //       at com.codeninja.controllers.OrderResource.create(OrderResource.java:31)
        //   In order to prevent create(OrderDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   create(OrderDto).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        OrderResource orderResource = new OrderResource();

        // Act
        orderResource.create(new OrderDto());
    }

    /**
     * Method under test: {@link OrderResource#delete(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDelete() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.services.OrderService.delete(java.lang.Long)" because "this.orderService" is null
        //       at com.codeninja.controllers.OrderResource.delete(OrderResource.java:36)
        //   In order to prevent delete(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   delete(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new OrderResource()).delete(123L);
    }

    /**
     * Method under test: {@link OrderResource#existsById(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExistsById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.services.OrderService.existsById(java.lang.Long)" because "this.orderService" is null
        //       at com.codeninja.controllers.OrderResource.existsById(OrderResource.java:41)
        //   In order to prevent existsById(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   existsById(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new OrderResource()).existsById(123L);
    }
}


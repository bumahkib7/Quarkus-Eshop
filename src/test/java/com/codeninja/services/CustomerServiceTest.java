package com.codeninja.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codeninja.DTO.CustomerDto;
import com.codeninja.models.Customer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashSet;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CustomerServiceTest {
    /**
     * Method under test: {@link CustomerService#create(CustomerDto)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.CustomerRepository.save(Object)" because "this.customerRepository" is null
        //       at com.codeninja.services.CustomerService.create(CustomerService.java:25)
        //   In order to prevent create(CustomerDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   create(CustomerDto).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        CustomerService customerService = new CustomerService();

        // Act
        customerService.create(new CustomerDto());
    }

    /**
     * Method under test: {@link CustomerService#create(CustomerDto)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreate2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.DTO.CustomerDto.getFirstName()" because "customerDto" is null
        //       at com.codeninja.services.CustomerService.create(CustomerService.java:26)
        //   In order to prevent create(CustomerDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   create(CustomerDto).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CustomerService()).create(null);
    }

    /**
     * Method under test: {@link CustomerService#findAll()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindAll() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.CustomerRepository.findAll()" because "this.customerRepository" is null
        //       at com.codeninja.services.CustomerService.findAll(CustomerService.java:39)
        //   In order to prevent findAll()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findAll().
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CustomerService()).findAll();
    }

    /**
     * Method under test: {@link CustomerService#findById(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.CustomerRepository.findById(Object)" because "this.customerRepository" is null
        //       at com.codeninja.services.CustomerService.findById(CustomerService.java:48)
        //   In order to prevent findById(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findById(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CustomerService()).findById(123L);
    }

    /**
     * Method under test: {@link CustomerService#findAllActive()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindAllActive() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.CustomerRepository.findAllByEnabled(java.lang.Boolean)" because "this.customerRepository" is null
        //       at com.codeninja.services.CustomerService.findAllActive(CustomerService.java:56)
        //   In order to prevent findAllActive()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findAllActive().
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CustomerService()).findAllActive();
    }

    /**
     * Method under test: {@link CustomerService#findAllInactive()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindAllInactive() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.CustomerRepository.findAllByEnabled(java.lang.Boolean)" because "this.customerRepository" is null
        //       at com.codeninja.services.CustomerService.findAllInactive(CustomerService.java:63)
        //   In order to prevent findAllInactive()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findAllInactive().
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CustomerService()).findAllInactive();
    }

    /**
     * Method under test: {@link CustomerService#delete(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDelete() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.CustomerRepository.findById(Object)" because "this.customerRepository" is null
        //       at com.codeninja.services.CustomerService.delete(CustomerService.java:70)
        //   In order to prevent delete(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   delete(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new CustomerService()).delete(123L);
    }

    /**
     * Method under test: {@link CustomerService#mapToDto(Customer)}
     */
    @Test
    void testMapToDto() {
        // Arrange
        Customer customer = new Customer();
        customer.setCarts(new HashSet<>());
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setCreatedDate(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        customer.setEmail("jane.doe@example.org");
        customer.setEnabled(true);
        customer.setFirstName("Jane");
        customer.setId(123L);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setLastModifiedDate(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        customer.setLastName("Doe");
        customer.setTelephone("4105551212");

        // Act
        CustomerDto actualMapToDtoResult = CustomerService.mapToDto(customer);

        // Assert
        assertEquals("jane.doe@example.org", actualMapToDtoResult.getEmail());
        assertEquals("4105551212", actualMapToDtoResult.getTelephone());
        assertEquals("Doe", actualMapToDtoResult.getLastName());
        assertEquals(123L, actualMapToDtoResult.getId().longValue());
        assertEquals("Jane", actualMapToDtoResult.getFirstName());
    }
}


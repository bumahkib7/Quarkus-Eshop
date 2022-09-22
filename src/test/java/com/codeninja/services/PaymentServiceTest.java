package com.codeninja.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.codeninja.DTO.PaymentDto;
import com.codeninja.Enum.PaymentStatus;
import com.codeninja.models.Payment;

import java.math.BigDecimal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PaymentServiceTest {
    /**
     * Method under test: {@link PaymentService#mapToDto(Payment, Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMapToDto() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.Enum.PaymentStatus.name()" because the return value of "com.codeninja.models.Payment.getStatus()" is null
        //       at com.codeninja.services.PaymentService.mapToDto(PaymentService.java:33)
        //   In order to prevent mapToDto(Payment, Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   mapToDto(Payment, Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Payment payment = new Payment();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        payment.setCreatedDate(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        payment.setId(123L);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        payment.setLastModifiedDate(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());

        // Act
        PaymentService.mapToDto(payment, 123L);
    }

    /**
     * Method under test: {@link PaymentService#mapToDto(Payment, Long)}
     */
    @Test
    void testMapToDto2() {
        // Arrange, Act and Assert
        assertNull(PaymentService.mapToDto(null, 1L));
    }

    /**
     * Method under test: {@link PaymentService#mapToDto(Payment, Long)}
     */
    @Test
    void testMapToDto3() {
        // Arrange
        Payment payment = new Payment("42", PaymentStatus.ACCEPTED, BigDecimal.valueOf(42L));
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        payment.setCreatedDate(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        payment.setId(123L);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        payment.setLastModifiedDate(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());

        // Act
        PaymentDto actualMapToDtoResult = PaymentService.mapToDto(payment, 123L);

        // Assert
        assertEquals(123L, actualMapToDtoResult.getId().longValue());
        assertEquals("ACCEPTED", actualMapToDtoResult.getStatus());
        assertEquals("42", actualMapToDtoResult.getPaypalPaymentId());
        assertEquals(123L, actualMapToDtoResult.getOrderId().longValue());
    }

    /**
     * Method under test: {@link PaymentService#findByPriceRange(Double)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindByPriceRange() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.PaymentRepository.findAllByAmountBetween(java.math.BigDecimal, java.math.BigDecimal)" because "this.paymentRepository" is null
        //       at com.codeninja.services.PaymentService.findByPriceRange(PaymentService.java:41)
        //   In order to prevent findByPriceRange(Double)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findByPriceRange(Double).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new PaymentService()).findByPriceRange(10.0d);
    }

    /**
     * Method under test: {@link PaymentService#findByPriceRange(Double)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindByPriceRange2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: Character N is neither a decimal digit number, decimal point, nor "e" notation exponential mark.
        //       at java.math.BigDecimal.<init>(BigDecimal.java:582)
        //       at java.math.BigDecimal.<init>(BigDecimal.java:467)
        //       at java.math.BigDecimal.<init>(BigDecimal.java:896)
        //       at java.math.BigDecimal.valueOf(BigDecimal.java:1354)
        //       at com.codeninja.services.PaymentService.findByPriceRange(PaymentService.java:42)
        //   In order to prevent findByPriceRange(Double)
        //   from throwing NumberFormatException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findByPriceRange(Double).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new PaymentService()).findByPriceRange(Double.NaN);
    }

    /**
     * Method under test: {@link PaymentService#findAll()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindAll() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.PaymentRepository.findAll()" because "this.paymentRepository" is null
        //       at com.codeninja.services.PaymentService.findAll(PaymentService.java:50)
        //   In order to prevent findAll()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findAll().
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new PaymentService()).findAll();
    }

    /**
     * Method under test: {@link PaymentService#findById(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.OrderRepository.findByPaymentId(java.lang.Long)" because "this.orderRepository" is null
        //       at com.codeninja.services.PaymentService.findOrderByPaymentId(PaymentService.java:81)
        //       at com.codeninja.services.PaymentService.findById(PaymentService.java:57)
        //   In order to prevent findById(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findById(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new PaymentService()).findById(123L);
    }

    /**
     * Method under test: {@link PaymentService#create(PaymentDto)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.OrderRepository.findById(Object)" because "this.orderRepository" is null
        //       at com.codeninja.services.PaymentService.create(PaymentService.java:68)
        //   In order to prevent create(PaymentDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   create(PaymentDto).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        PaymentService paymentService = new PaymentService();

        // Act
        paymentService.create(new PaymentDto());
    }

    /**
     * Method under test: {@link PaymentService#create(PaymentDto)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreate2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.DTO.PaymentDto.getOrderId()" because "paymentDto" is null
        //       at com.codeninja.services.PaymentService.create(PaymentService.java:68)
        //   In order to prevent create(PaymentDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   create(PaymentDto).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new PaymentService()).create(null);
    }

    /**
     * Method under test: {@link PaymentService#delete(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDelete() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.PaymentRepository.deleteById(Object)" because "this.paymentRepository" is null
        //       at com.codeninja.services.PaymentService.delete(PaymentService.java:87)
        //   In order to prevent delete(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   delete(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new PaymentService()).delete(123L);
    }
}


package com.codeninja.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeninja.DTO.ProductDto;
import com.codeninja.Enum.ProductStatus;
import com.codeninja.models.Category;
import com.codeninja.models.Product;
import com.codeninja.models.Review;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashSet;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ProductServiceTest {
    /**
     * Method under test: {@link ProductService#mapToDto(Product)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMapToDto() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.Enum.ProductStatus.name()" because the return value of "com.codeninja.models.Product.getStatus()" is null
        //       at com.codeninja.services.ProductService.mapToDto(ProductService.java:31)
        //   In order to prevent mapToDto(Product)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   mapToDto(Product).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Product product = new Product();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setCreatedDate(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        product.setId(123L);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setLastModifiedDate(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        product.setReviews(new HashSet<>());

        // Act
        ProductService.mapToDto(product);
    }

    /**
     * Method under test: {@link ProductService#mapToDto(Product)}
     */
    @Test
    void testMapToDto2() {
        // Arrange
        BigDecimal valueOfResult = BigDecimal.valueOf(42L);
        HashSet<Review> reviews = new HashSet<>();

        Product product = new Product("Name", "The characteristics of someone or something", valueOfResult,
                ProductStatus.AVAILABLE, 3, reviews, new Category());
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setCreatedDate(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        product.setId(123L);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setLastModifiedDate(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        product.setReviews(new HashSet<>());

        // Act
        ProductDto actualMapToDtoResult = ProductService.mapToDto(product);

        // Assert
        assertNull(actualMapToDtoResult.getCategoryId());
        assertEquals("AVAILABLE", actualMapToDtoResult.getStatus());
        assertEquals(3, actualMapToDtoResult.getSalesCounter().intValue());
        assertTrue(actualMapToDtoResult.getReviews().isEmpty());
        BigDecimal price = actualMapToDtoResult.getPrice();
        assertSame(valueOfResult, price);
        assertEquals("Name", actualMapToDtoResult.getName());
        assertEquals("The characteristics of someone or something", actualMapToDtoResult.getDescription());
        assertEquals(123L, actualMapToDtoResult.getId().longValue());
        assertEquals("42", price.toString());
    }

    /**
     * Method under test: {@link ProductService#mapToDto(Product)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMapToDto3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.models.Category.getId()" because the return value of "com.codeninja.models.Product.getCategory()" is null
        //       at com.codeninja.services.ProductService.mapToDto(ProductService.java:33)
        //   In order to prevent mapToDto(Product)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   mapToDto(Product).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BigDecimal price = BigDecimal.valueOf(42L);

        Product product = new Product("Name", "The characteristics of someone or something", price,
                ProductStatus.AVAILABLE, 3, new HashSet<>(), null);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setCreatedDate(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        product.setId(123L);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setLastModifiedDate(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        product.setReviews(new HashSet<>());

        // Act
        ProductService.mapToDto(product);
    }

    /**
     * Method under test: {@link ProductService#findAll()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindAll() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.ProductRepository.findAll()" because "this.productRepository" is null
        //       at com.codeninja.services.ProductService.findAll(ProductService.java:38)
        //   In order to prevent findAll()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findAll().
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ProductService productService = new ProductService();

        // Act
        productService.findAll();
    }

    /**
     * Method under test: {@link ProductService#findById(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.ProductRepository.findById(Object)" because "this.productRepository" is null
        //       at com.codeninja.services.ProductService.findById(ProductService.java:44)
        //   In order to prevent findById(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findById(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ProductService productService = new ProductService();
        long id = 123L;

        // Act
        productService.findById(id);
    }

    /**
     * Method under test: {@link ProductService#countAll()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCountAll() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.ProductRepository.count()" because "this.productRepository" is null
        //       at com.codeninja.services.ProductService.countAll(ProductService.java:48)
        //   In order to prevent countAll()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   countAll().
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ProductService productService = new ProductService();

        // Act
        productService.countAll();
    }

    /**
     * Method under test: {@link ProductService#countByCategoryId(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCountByCategoryId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.ProductRepository.countAllByCategoryId(java.lang.Long)" because "this.productRepository" is null
        //       at com.codeninja.services.ProductService.countByCategoryId(ProductService.java:52)
        //   In order to prevent countByCategoryId(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   countByCategoryId(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ProductService productService = new ProductService();
        long id = 123L;

        // Act
        productService.countByCategoryId(id);
    }

    /**
     * Method under test: {@link ProductService#create(ProductDto)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Name is null
        //       at java.lang.Enum.valueOf(Enum.java:271)
        //       at com.codeninja.Enum.ProductStatus.valueOf(ProductStatus.java:3)
        //       at com.codeninja.services.ProductService.create(ProductService.java:57)
        //   In order to prevent create(ProductDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   create(ProductDto).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ProductService productService = new ProductService();
        ProductDto productDto = new ProductDto();

        // Act
        productService.create(productDto);
    }

    /**
     * Method under test: {@link ProductService#create(ProductDto)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreate2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.DTO.ProductDto.getName()" because "productDto" is null
        //       at com.codeninja.services.ProductService.create(ProductService.java:57)
        //   In order to prevent create(ProductDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   create(ProductDto).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ProductService productService = new ProductService();
        ProductDto productDto = null;

        // Act
        productService.create(productDto);
    }

    /**
     * Method under test: {@link ProductService#create(ProductDto)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreate3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.CategoryRepository.findById(Object)" because "this.categoryRepository" is null
        //       at com.codeninja.services.ProductService.create(ProductService.java:57)
        //   In order to prevent create(ProductDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   create(ProductDto).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ProductService productService = new ProductService();
        BigDecimal price = BigDecimal.valueOf(42L);
        HashSet<Review> reviews = new HashSet<>();
        ProductDto productDto = ProductService.mapToDto(new Product("Name", "The characteristics of someone or something",
                price, ProductStatus.AVAILABLE, 3, reviews, new Category()));

        // Act
        productService.create(productDto);
    }

    /**
     * Method under test: {@link ProductService#delete(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDelete() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.ProductRepository.deleteById(Object)" because "this.productRepository" is null
        //       at com.codeninja.services.ProductService.delete(ProductService.java:62)
        //   In order to prevent delete(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   delete(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ProductService productService = new ProductService();
        long id = 123L;

        // Act
        productService.delete(id);
    }

    /**
     * Method under test: {@link ProductService#findByCategoryId(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindByCategoryId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.repositories.ProductRepository.findByCategoryId(java.lang.Long)" because "this.productRepository" is null
        //       at com.codeninja.services.ProductService.findByCategoryId(ProductService.java:66)
        //   In order to prevent findByCategoryId(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findByCategoryId(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ProductService productService = new ProductService();
        long id = 123L;

        // Act
        productService.findByCategoryId(id);
    }
}


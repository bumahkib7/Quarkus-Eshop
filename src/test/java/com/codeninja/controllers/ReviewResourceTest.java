package com.codeninja.controllers;

import com.codeninja.DTO.ReviewDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ReviewResourceTest {
    /**
     * Method under test: {@link ReviewResource#findAllByProduct(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindAllByProduct() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.services.ReviewService.findReviewsByProductId(java.lang.Long)" because "this.reviewService" is null
        //       at com.codeninja.controllers.ReviewResource.findAllByProduct(ReviewResource.java:19)
        //   In order to prevent findAllByProduct(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findAllByProduct(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ReviewResource reviewResource = new ReviewResource();
        long id = 123L;

        // Act
        reviewResource.findAllByProduct(id);
    }

    /**
     * Method under test: {@link ReviewResource#findById(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.services.ReviewService.findById(java.lang.Long)" because "this.reviewService" is null
        //       at com.codeninja.controllers.ReviewResource.findById(ReviewResource.java:25)
        //   In order to prevent findById(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findById(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ReviewResource reviewResource = new ReviewResource();
        long id = 123L;

        // Act
        reviewResource.findById(id);
    }

    /**
     * Method under test: {@link ReviewResource#create(ReviewDto, Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.services.ReviewService.create(com.codeninja.DTO.ReviewDto, java.lang.Long)" because "this.reviewService" is null
        //       at com.codeninja.controllers.ReviewResource.create(ReviewResource.java:31)
        //   In order to prevent create(ReviewDto, Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   create(ReviewDto, Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ReviewResource reviewResource = new ReviewResource();
        ReviewDto reviewDto = new ReviewDto();
        long id = 123L;

        // Act
        reviewResource.create(reviewDto, id);
    }

    /**
     * Method under test: {@link ReviewResource#delete(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDelete() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.codeninja.services.ReviewService.delete(java.lang.Long)" because "this.reviewService" is null
        //       at com.codeninja.controllers.ReviewResource.delete(ReviewResource.java:37)
        //   In order to prevent delete(Long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   delete(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ReviewResource reviewResource = new ReviewResource();
        long id = 123L;

        // Act
        reviewResource.delete(id);
    }
}


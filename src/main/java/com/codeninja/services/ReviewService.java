package com.codeninja.services;

import com.codeninja.DTO.ReviewDto;
import com.codeninja.models.Product;
import com.codeninja.models.Review;
import com.codeninja.repositories.ProductRepository;
import com.codeninja.repositories.ReviewRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
@Slf4j
@ApplicationScoped
@Transactional
@AllArgsConstructor(onConstructor = @__(@Inject))

public class ReviewService {
    @Inject
    ReviewRepository reviewRepository;
    @Inject
    ProductRepository productRepository;




    /**
     * > This function returns a list of reviews for a given product id
     *
     * @param id The id of the product you want to find reviews for.
     * @return A list of ReviewDto objects
     */
    public List<ReviewDto> findReviewsByProductId(Long id) {
        log.debug("Request to get all Reviews");
        return this.reviewRepository.findReviewsByProductId(id)
                .stream()
                .map(ReviewService::mapToDto)
                .collect(Collectors.toList());
    }

    /**
     * > Find a review by id, if it exists, map it to a DTO, otherwise return null
     *
     * @param id The id of the review to be retrieved.
     * @return A ReviewDto object
     */
    public ReviewDto findById(Long id) {
        log.debug("Request to get Review : {}", id);
        return this.reviewRepository
                .findById(id)
                .map(ReviewService::mapToDto)
                .orElse(null);
    }

    /**
     * We are creating a new Review and saving it to the database
     *
     * @param reviewDto The ReviewDto object that we want to create.
     * @param productId The ID of the product that the review is for.
     * @return ReviewDto
     */
    public ReviewDto create(ReviewDto reviewDto, Long productId) {
        log.debug("Request to create Review : {} ofr the Product {}",
                reviewDto, productId);
        Product product = this.productRepository.findById(productId)
                .orElseThrow(() ->
                        new IllegalStateException(
                                "Product with ID:" + productId + " was not found !"));
        Review savedReview = this.reviewRepository.saveAndFlush(
                new Review(
                        reviewDto.getTitle(),
                        reviewDto.getDescription(),
                        reviewDto.getRating()));
        product.getReviews().add(savedReview);
        this.productRepository.saveAndFlush(product);
        return mapToDto(savedReview);
    }

    /**
     * We find the review by its ID, then we find the product that the review belongs to, then we remove the review from
     * the product's list of reviews, then we save the product, then we delete the review
     *
     * @param reviewId The ID of the review to be deleted.
     */
    public void delete(Long reviewId) {
        log.debug("Request to delete Review : {}", reviewId);
        Review review = this.reviewRepository.findById(reviewId)
                .orElseThrow(() ->
                        new IllegalStateException(
                                "Product with ID:" + reviewId + " was not found !"));
        Product product = this.productRepository.findProductByReviewId
                (reviewId);
        product.getReviews().remove(review);
        this.productRepository.saveAndFlush(product);
        this.reviewRepository.delete(review);
    }

    // This is a static method that takes a Review object and maps it to a ReviewDto object.
    public static ReviewDto mapToDto(Review review) {
        return new ReviewDto(
                review.getId(),
                review.getTitle(),
                review.getDescription(),
                review.getRating()
        ); }
}
package com.example.moreconreviewapi.controller;

import com.example.moreconreviewapi.domain.Review;
import com.example.moreconreviewapi.domain.ReviewImage;
import com.example.moreconreviewapi.service.ReviewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/reviews")
    public List<Review> getReviews(@RequestParam("itemId") String itemId) {
        return reviewService.getPublishedReviewsByItemId(itemId);
    }

    @GetMapping("/image")
    public List<ReviewImage> getReviewImage(@RequestParam("reviewId") String reviewId) {
        return reviewService.getReviewImageSV(reviewId);
    }

}


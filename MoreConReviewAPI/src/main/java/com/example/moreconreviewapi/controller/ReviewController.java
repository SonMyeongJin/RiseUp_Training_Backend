package com.example.moreconreviewapi.controller;

import com.example.moreconreviewapi.domain.NewReview;
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

    // 위에 두개 합쳐서 한번에 리뷰결과를 가져온다
    // 上の二つを合わせて一度にレビュー結果をもたらす
    @GetMapping("/review")
    public List<NewReview> getReview(@RequestParam("itemId") String itemId) {

        reviewService.getReviewImageSV(itemId);
        reviewService.getPublishedReviewsByItemId(itemId);

        return null;
    }
}


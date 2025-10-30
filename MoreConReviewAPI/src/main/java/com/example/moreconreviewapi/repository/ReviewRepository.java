package com.example.moreconreviewapi.repository;

import com.example.moreconreviewapi.domain.Review;
import com.example.moreconreviewapi.domain.ReviewImage;
import com.example.moreconreviewapi.mapper.ReviewImageMapper;
import com.example.moreconreviewapi.mapper.ReviewMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public class ReviewRepository {
    private final ReviewMapper reviewMapper;
    private final ReviewImageMapper reviewImageMapper;

    public ReviewRepository(ReviewMapper reviewMapper, ReviewImageMapper reviewImageMapper) {
        this.reviewMapper = reviewMapper;
        this.reviewImageMapper = reviewImageMapper;
    }

    public List<Review> findPublishedReviewsByItemId(String itemId) {
        return reviewMapper.findPublishedReviewsByItemId(itemId);
    }

    public List<ReviewImage> getReviewImage(@RequestParam("reviewId") String reviewId) {
        return reviewImageMapper.findPublishedImagesByReviewId(reviewId);
    }
}

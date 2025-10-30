package com.example.moreconreviewapi.service;

import com.example.moreconreviewapi.domain.Review;
import com.example.moreconreviewapi.domain.ReviewImage;
import com.example.moreconreviewapi.mapper.ReviewImageMapper;
import com.example.moreconreviewapi.mapper.ReviewMapper;
import com.example.moreconreviewapi.repository.ReviewRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ReviewService {
    private final ReviewMapper reviewMapper;
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewMapper reviewMapper, ReviewImageMapper reviewImageMapper, ReviewRepository reviewRepository) {
        this.reviewMapper = reviewMapper;
        this.reviewRepository = reviewRepository;
    }

    // 특정 상품 ID의 공개 리뷰 목록 반환
    public List<Review> getPublishedReviewsByItemId(String itemId) {
        return reviewMapper.findPublishedReviewsByItemId(itemId);
    }

    public List<ReviewImage> getReviewImageSV(@RequestParam("reviewId") String reviewId) {
        return reviewRepository.getReviewImage(reviewId);
    }
}

package com.example.moreconreviewapi.service;

import com.example.moreconreviewapi.domain.Review;
import com.example.moreconreviewapi.mapper.ReviewMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    private final ReviewMapper reviewMapper;

    public ReviewService(ReviewMapper reviewMapper) {
        this.reviewMapper = reviewMapper;
    }

    // 특정 상품 ID의 공개 리뷰 목록 반환
    public List<Review> getPublishedReviewsByItemId(String itemId) {
        return reviewMapper.findPublishedReviewsByItemId(itemId);
    }
}

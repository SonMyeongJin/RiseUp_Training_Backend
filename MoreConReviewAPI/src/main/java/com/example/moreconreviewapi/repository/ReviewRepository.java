package com.example.moreconreviewapi.repository;

import com.example.moreconreviewapi.domain.Review;
import com.example.moreconreviewapi.mapper.ReviewMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReviewRepository {
    private final ReviewMapper reviewMapper;

    public ReviewRepository(ReviewMapper reviewMapper) {
        this.reviewMapper = reviewMapper;
    }

    public List<Review> findPublishedReviewsByItemId(String itemId) {
        return reviewMapper.findPublishedReviewsByItemId(itemId);
    }
}

package com.example.moreconreviewapi.repository;

import com.example.moreconreviewapi.domain.Review;
import com.example.moreconreviewapi.service.ReviewService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReviewRepository {

    @Autowired
    private ReviewService reviewService;

    public ReviewRepository(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    public List<Review> getReviews(@Param("item_id") String item_id) {
        // DB에서 item_id에 해당하는 리뷰를 반환
        // published 인 리뷰만 반환

        return null;
    }
}

package com.example.moreconreviewapi.service;

import com.example.moreconreviewapi.domain.Review;
import com.example.moreconreviewapi.domain.ReviewImage;
import com.example.moreconreviewapi.repository.ReviewRepository;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private ReviewService reviewService;

    public ReviewService(ReviewRepository reviewRepository, ReviewService reviewService) {
        this.reviewRepository = reviewRepository;
        this.reviewService = reviewService;
    }

    public List<Review> getReviews(@Param("item_id") String item_id) {

        //published가 공개인 리뷰만 반환

        return null;
    }

}

package com.example.moreconreviewapi.controller;

import com.example.moreconreviewapi.domain.Review;
import com.example.moreconreviewapi.service.ReviewService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReivewController {

    @Autowired
    private final ReviewService reviewService;

    public ReivewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    // 상품번호를 받아서 해당하는 상품의 리뷰를 리스트로 반환
    public List<Review> getReivews(@Param("item_id") String item_id) {

        return null;
    }
}

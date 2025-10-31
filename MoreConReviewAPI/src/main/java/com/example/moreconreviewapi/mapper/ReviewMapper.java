package com.example.moreconreviewapi.mapper;

import com.example.moreconreviewapi.domain.NewReview;
import com.example.moreconreviewapi.domain.Review;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReviewMapper { // 기존 class -> interface 변경
    // 특정 상품의 공개 리뷰 목록 조회
    List<Review> findPublishedReviewsByItemId(@Param("itemId") String itemId);

    List<NewReview> findNewReviewsByItemId(@Param("itemId") String itemId);
}

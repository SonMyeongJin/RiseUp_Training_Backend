package com.example.moreconreviewapi.mapper;

import com.example.moreconreviewapi.domain.Review;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReviewMapper { // 기존 class -> interface 변경
    List<Review> findPublishedReviewsByItemId(@Param("itemId") String item_id);
}

package com.example.moreconreviewapi.mapper;

import com.example.moreconreviewapi.domain.ReviewImage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReviewImageMapper {
    List<ReviewImage> findPublishedImagesByReviewId(@Param("reviewId") String reviewId);
}

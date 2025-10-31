package com.example.moreconreviewapi.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ReviewControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("GET /reviews - 成功時にレビューリストをJSONに返す")
    void getReviewsTest() throws Exception {

        // 가짜 리뷰데이터 준비
        // 偽のレビューデータを準備

        // 리뷰 서비스를 호출했는지
        // レビューサービスを呼び出したのか

        // 성공시 리뷰 목록을 JSON으로 반환했는지
        // 成功時にレビューリストをJSONに返却したか
    }

    @Test
    @DisplayName("GET /image - 成功時にレビュー画像リストをJSONに返す")
    void getReviewImageTest() throws Exception {

        // 가짜 리뷰이미지데이터 준비
        // 偽レビューイメージデータを準備

        // 리뷰 서비스의 getReviewImageSV 함수를 호출했는지
        // レビューサービスのgetReview ImageSV関数を呼び出したのか

        // 성공시 리뷰 이미지 목록을 JSON으로 반환했는지
        // 成功時にレビュー画像リストをJSONに返却したか
    }

}


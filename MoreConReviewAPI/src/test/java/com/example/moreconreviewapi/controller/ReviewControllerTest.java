package com.example.moreconreviewapi.controller;

import com.example.moreconreviewapi.service.ReviewService;
import org.junit.jupiter.api.*;
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
        String itemId = "item-1001";

        mockMvc.perform(get("/reviews")
                        .param("itemId", itemId))
                .andExpect(status().isOk())
                .andExpect(result -> {
                    // JSON 배열인지(빈 배열 가능)
                    Assertions.assertTrue(result.getResponse().getContentAsString().startsWith("["));
                });
    }

    @Test
    @DisplayName("GET /review - 何もないとき[]を返す")
    void getReviewsTest2() throws Exception {
        mockMvc.perform(get("/review")
                        .param("itemId", "nonexistentItemId"))
                .andExpect(status().isOk())
                .andExpect(result -> Assertions.assertEquals("[]", result.getResponse().getContentAsString()));
    }

    @Test
    @DisplayName("GET /image - 成功時にレビュー画像リストをJSONに返す")
    void getReviewImageTest() throws Exception {
        String reviewId = "rev-1001";

        mockMvc.perform(get("/image")
                        .param("reviewId", reviewId))
                .andExpect(status().isOk())
                .andExpect(result ->
                        Assertions.assertTrue(result.getResponse()
                                .getContentAsString()
                                .startsWith("[")) // 빈 배열도 허용
                );

    }
}


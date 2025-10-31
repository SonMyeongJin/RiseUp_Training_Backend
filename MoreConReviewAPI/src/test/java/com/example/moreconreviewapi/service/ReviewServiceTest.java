package com.example.moreconreviewapi.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class ReviewServiceTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getPublishedReviewsByItemIdTest() {
        //reviewRepository.findPublishedReviewsByItemId 함수 호출 하는지 확인
        //review Repository.findPublished Reviews ByItemId関数を呼び出すか確認

        // itemId 로 리뷰를 가져오는지 확인
        // itemIdでレビューを持ってくるか確認

        // status = 공개 인 이미지만 가져오는지 확인
        // status = 公開の画像のみ持ってくるか確認

        // 테스트 가져오는 데이터 항목이 전부 있는지, 정렬순서 확인
        // テストを取得するデータ項目がすべてあるか、並び替え順序を確認

    }

    @Test
    void getReviewImageSVTest() {
        // reviewRepository.getReviewImage 함수 호출 하는지 확인
        // review Repository.getReview Image関数を呼び出すか確認

        // status = 공개 인 이미지만 가져오는지 확인
        // status = 公開の画像のみ持ってくるか確認

        // 리뷰 아이디로 리뷰 이미지 가져오는지 확인
        // レビューIDでレビュー画像を取得するか確認

        // 테스트 가져오는 데이터 항목이 전부 있는지, 정렬순서 확인
        // テストを取得するデータ項目がすべてあるか、並び替え順序を確認
    }
}
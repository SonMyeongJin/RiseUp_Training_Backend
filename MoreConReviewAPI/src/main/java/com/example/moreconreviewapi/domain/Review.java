package com.example.moreconreviewapi.domain;

import java.sql.Timestamp;

public class Review {
    /*
    レビュー識別番号          VARCHAR(36) PRIMARY KEY,
    会員識別番号        VARCHAR(36) NOT NULL,
    商品識別番号 VARCHAR(36) NOT NULL,
    レーティング             INTEGER     NOT NULL,
    レビュー内容             VARCHAR(3000),
    公開状態 VARCHAR(10) NOT NULL DEFAULT '非公開',
    登録日時                TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
    */

    String review_id; // PK
    String user_id;
    String item_id;
    int rating;
    String content;
    String published;
    Timestamp published_date;

    public String getReview_id() {
        return review_id;
    }

    public void setReview_id(String review_id) {
        this.review_id = review_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public Timestamp getPublished_date() {
        return published_date;
    }

    public void setPublished_date(Timestamp published_date) {
        this.published_date = published_date;
    }
}

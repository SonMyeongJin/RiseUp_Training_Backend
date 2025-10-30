package com.example.moreconreviewapi.domain;

import java.sql.Timestamp;

public class ReviewLike {
    /*
    レビューいいね識別番号      VARCHAR(36) PRIMARY KEY,
    レビュー識別番号           VARCHAR(36) NOT NULL,
    会員識別番号              VARCHAR(36) NOT NULL,
    登録日時                 TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
    */

    String review_like_id; // PK
    String review_id;
    String user_id;
    Timestamp create_date;

    public String getReview_like_id() {
        return review_like_id;
    }

    public void setReview_like_id(String review_like_id) {
        this.review_like_id = review_like_id;
    }

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

    public Timestamp getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }
}

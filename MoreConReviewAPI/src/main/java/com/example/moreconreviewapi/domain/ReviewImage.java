package com.example.moreconreviewapi.domain;

import java.sql.Timestamp;

public class ReviewImage {
    /*
    レビュー画像識別番号      VARCHAR(36) PRIMARY KEY,
    レビュー識別番号         VARCHAR(36) NOT NULL,
    画像url                VARCHAR(200) NOT NULL,
    表示順                 SMALLINT NOT NULL,
    公開状態 VARCHAR(10) NOT NULL DEFAULT '非公開',
    登録日時                TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    更新日時 TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
    */

    String review_image_id; // PK
    String review_id;
    String image_url;
    short display_order;
    String published;
    Timestamp create_date;
    Timestamp update_date;

    public String getReview_image_id() {
        return review_image_id;
    }

    public void setReview_image_id(String review_image_id) {
        this.review_image_id = review_image_id;
    }

    public String getReview_id() {
        return review_id;
    }

    public void setReview_id(String review_id) {
        this.review_id = review_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public short getDisplay_order() {
        return display_order;
    }

    public void setDisplay_order(short display_order) {
        this.display_order = display_order;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public Timestamp getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }

    public Timestamp getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Timestamp update_date) {
        this.update_date = update_date;
    }
}

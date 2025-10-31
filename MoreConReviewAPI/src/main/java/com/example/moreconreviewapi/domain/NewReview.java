package com.example.moreconreviewapi.domain;

public class NewReview {
    /*
    1. 会員識別番号
    2. レビュワー名
    3. レビュワープロフィール画像URL
    4. レーティング
    5. レビュー内容
    6. 画像URL
        1. 複数あれば複数取得。レビュー画像テーブルの表示順の照準になっていること
    7. レビューの登録日時
    */
    private String review_id;
    private String reviewer_name;
    private String reviewer_profile_image_url; //Reviewer - profile_url
    private int rating;
    private String review_content;
    private String review_image_url;     // ReviewImage - image_url
    private String review_create_date;

    public String getReview_id() {
        return review_id;
    }

    public void setReview_id(String review_id) {
        this.review_id = review_id;
    }

    public String getReviewer_name() {
        return reviewer_name;
    }

    public void setReviewer_name(String reviewer_name) {
        this.reviewer_name = reviewer_name;
    }

    public String getReviewer_profile_image_url() {
        return reviewer_profile_image_url;
    }

    public void setReviewer_profile_image_url(String reviewer_profile_image_url) {
        this.reviewer_profile_image_url = reviewer_profile_image_url;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview_content() {
        return review_content;
    }

    public void setReview_content(String review_content) {
        this.review_content = review_content;
    }

    public String getReview_image_url() {
        return review_image_url;
    }

    public void setReview_image_url(String review_image_url) {
        this.review_image_url = review_image_url;
    }

    public String getReview_create_date() {
        return review_create_date;
    }

    public void setReview_create_date(String review_create_date) {
        this.review_create_date = review_create_date;
    }
}

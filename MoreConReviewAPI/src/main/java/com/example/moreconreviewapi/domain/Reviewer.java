package com.example.moreconreviewapi.domain;

import java.sql.Timestamp;

public class Reviewer {
    /*
    会員識別番号        VARCHAR(36) PRIMARY KEY,
    レビュワー名             VARCHAR(100) NOT NULL,
    プロフィール画像url       VARCHAR(200) NOT NULL,
    登録日時                TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
    */

    String reviewer_id; // PK
    String reviewer_name;
    String profile_url;
    Timestamp create_date;

    public String getReviewer_id() {
        return reviewer_id;
    }

    public void setReviewer_id(String reviewer_id) {
        this.reviewer_id = reviewer_id;
    }

    public String getReviewer_name() {
        return reviewer_name;
    }

    public void setReviewer_name(String reviewer_name) {
        this.reviewer_name = reviewer_name;
    }

    public String getProfile_url() {
        return profile_url;
    }

    public void setProfile_url(String profile_url) {
        this.profile_url = profile_url;
    }

    public Timestamp getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }
}

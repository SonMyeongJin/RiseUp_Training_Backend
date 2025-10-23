package com.example.flyway_mybatis_practice.domain;

import lombok.Data;

import java.security.Timestamp;

@Data
public class maker {
    int maker_id;
    String name;
    Timestamp create_time;
    Timestamp update_time;
    int del_flg;
}

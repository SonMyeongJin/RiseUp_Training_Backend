package com.example.flyway_mybatis_practice.domain;

import java.sql.Timestamp;

public class maker {
    private int maker_id;
    private String name;
    private java.sql.Timestamp create_date;
    private java.sql.Timestamp update_date;
    private int del_flg;

    public int getMaker_id() { return maker_id; }
    public void setMaker_id(int maker_id) { this.maker_id = maker_id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public java.sql.Timestamp getCreate_date() { return create_date; }
    public void setCreate_date(java.sql.Timestamp create_date) { this.create_date = create_date; }

    public java.sql.Timestamp getUpdate_date() { return update_date; }
    public void setUpdate_date(Timestamp update_date) { this.update_date = update_date; }

    public int getDel_flg() { return del_flg; }
    public void setDel_flg(int del_flg) { this.del_flg = del_flg; }
}

package com.example.flyway_mybatis_practice.mapper;

import com.example.flyway_mybatis_practice.domain.maker;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface makerMapper {

    List<maker> selectFlg0();
}

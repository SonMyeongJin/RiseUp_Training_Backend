package com.example.flyway_mybatis_practice.mapper;

import com.example.flyway_mybatis_practice.domain.Maker;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MakerMapper {

    List<Maker> selectFlg0();
}

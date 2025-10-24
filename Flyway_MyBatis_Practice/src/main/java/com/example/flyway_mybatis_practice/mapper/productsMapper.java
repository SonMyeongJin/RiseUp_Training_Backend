package com.example.flyway_mybatis_practice.mapper;

import com.example.flyway_mybatis_practice.domain.products;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface productsMapper {

    List<products> selectStatus1();

}

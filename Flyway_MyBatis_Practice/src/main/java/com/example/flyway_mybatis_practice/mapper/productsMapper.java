package com.example.flyway_mybatis_practice.mapper;

import com.example.flyway_mybatis_practice.domain.products;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface productsMapper {

    List<products> selectStatus1();

    // product_id 기준 status=2 업데이트.
    int updateStatus2ById(@Param("productId") Long productId);
}

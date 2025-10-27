package com.example.flyway_mybatis_practice.mapper;

import com.example.flyway_mybatis_practice.domain.Products;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductsMapper {

    //  List<Products> selectStatus1();
    List<Products> selectStatus1(@Param("makerId") Long makerId);

    // product_id 기준 status=2 업데이트.
    int updateStatus2ById(@Param("productId") Long productId);
}

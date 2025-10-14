package com.example.shopping_application.service;

import com.example.shopping_application.domain.Product;
import com.example.shopping_application.dto.ProductDto;
import com.example.shopping_application.repository.ListProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ListProductRepository listProductRepository;
    private ModelMapper modelMapper;


    @Autowired
    public ProductService(ListProductRepository listProductRepository , ModelMapper modelMapper) {
        this.listProductRepository = listProductRepository;
        this.modelMapper = modelMapper;
    }
//---------------------------------- 상품 등록하기(Register) --------------------------------------
    public ProductDto add(ProductDto productDto) {
        // ProductDto 를 Product 로 변환하는 코드
        Product product = modelMapper.map(productDto, Product.class);

        // 레포지토리를 호출하는 코드
        Product savedProduct = listProductRepository.add(product);

        // Product 를 ProductDto 로 변환하는 코드
        ProductDto savedProductDto = modelMapper.map(savedProduct, ProductDto.class);

        // 변환된 ProductDto 를 리턴하는 코드
        return savedProductDto;
    }
//---------------------------------- 상품 조회하기(Find) --------------------------------------
    // 이 함수는 controller에서 호출하겠지
    public ProductDto findById(Long id) {
        // 레퍼지토리에서 id로 Product 를 찾는 코드
        Product product = listProductRepository.findById(id);
        // Product 를 ProductDto 로 변환하는 코드
        ProductDto productDto = modelMapper.map(product, ProductDto.class);
        return productDto;
    }

    // 이 함수도 컨트롤러에서 호출할거야
    public List<ProductDto> findAll() {
        // 레포지토리에서 모든 Product 를 찾는 코드
        List<Product> products = listProductRepository.findAll();
        // List<Product> 를 List<ProductDto> 로 변환하는 코드
        List<ProductDto> productDtos = products.stream()
                .map(product -> modelMapper.map(product, ProductDto.class))
                .toList();
        return productDtos;
    }

    public List<ProductDto> findByNameContaining(String name) {
        //레포지토리에서 name으로 Product를 찾는 코드
        List<Product> products = listProductRepository.findByNameContaining(name);
        //List<Product> 를 List<ProductDto> 로 변환하는 코드
        List<ProductDto> productDtos = products.stream()
                .map(product -> modelMapper.map(product, ProductDto.class))
                .toList();
        return productDtos;

    }
//---------------------------------- 상품 수정하기(Edit) --------------------------------------
    public ProductDto update(ProductDto productDto) {
        // ProductDto 를 Product 로 변환하는 코드
        Product product = modelMapper.map(productDto, Product.class);

        // 레포지토리를 호출해서 update 하는 코드
        Product updatedProduct = listProductRepository.update(product);

        // Product 를 ProductDto 로 변환하는 코드
        ProductDto updatedProductDto = modelMapper.map(updatedProduct, ProductDto.class);
        return updatedProductDto;

    }
//---------------------------------- 상품 삭제하기(Delete) --------------------------------------
    public void delete(Long id) {
        listProductRepository.delete(id);
    }
}

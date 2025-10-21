package com.example.shopping_application.controller;

import com.example.shopping_application.dto.ProductDto;
import com.example.shopping_application.service.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    // 등록 성공, 검증실패 2가지 케이스 작성한다 !

    // 등록 성공
    @DisplayName(" Success product create")
    @Test
    void createProduct_success() throws Exception {
        ProductDto saved = new ProductDto();
        saved.setId(1L);
        saved.setName("연필");
        saved.setPrice(300);
        saved.setAmount(10);

        Mockito.when(productService.add(any(ProductDto.class))).thenReturn(saved);

        String body = """
        {
          "name": "연필",
          "price": 300,
          "amount": 10
        }
        """;

        mockMvc.perform(post("/products")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(body))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.name").value("연필"))
                .andExpect(jsonPath("$.price").value(300))
                .andExpect(jsonPath("$.amount").value(10));
    }

    // 검증실패
    @DisplayName(" Fail product create - validation error")
    @Test
    void createProduct_fail() throws Exception {
        String body = """
        {
          "name": null,
          "price": null,
          "amount": null
        }
        """;

        mockMvc.perform(post("/products")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(body))
                .andExpect(status().isBadRequest());
    }
}
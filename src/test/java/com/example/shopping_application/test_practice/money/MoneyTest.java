package com.example.shopping_application.test_practice.money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        // five라는 객에에 amount 5를 넣어 생성
        Dollar five = new Dollar(5);

        //five라는 객체의 amount=5 에 2를 곱한 값을 새로운 product 라는 객체에 저장
        Dollar product = five.times(2);
        assertEquals (10, product.amount);

        // 실패
        // expect : 15
        // actual : 30
        // 위에 만든 product라는 객체에 five 객체의 amount 5에 3을 곱한 값을 덮어씀
        product = five.times(3);
        assertEquals (15, product.amount);
    }
}

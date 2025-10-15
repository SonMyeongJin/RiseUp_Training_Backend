package com.example.shopping_application.test_practice.money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals (10, five.amount);

        // 실패
        // expect : 15
        // actual : 30
        five.times(3);
        assertEquals (15, five.amount);
    }
}

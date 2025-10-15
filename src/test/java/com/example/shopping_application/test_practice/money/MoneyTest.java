package com.example.shopping_application.test_practice.money;

import org.junit.jupiter.api.Test;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dallar five = new Dallar(5);
        five.times(2);
        assert (five.times(2).amount == 10);
    }
}

package com.example.shopping_application.junit;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    @org.junit.jupiter.api.Test
    void add() {

        assertEquals(4, new Calc().add(2, 2));
        assertEquals(6, new Calc().add(4, 2));

        assertThrows(NumberFormatException.class, () -> new Calc().add(-100, 10),
                "음수는 나오지 않습니다");
    }
}
package com.example.shopping_application.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OlympicTest {


    @org.junit.jupiter.api.Test
    void 근대올림픽개최일전() {

        // false
        assertFalse(new Olympic().isSummerOlympicYear(1888),"1888년은 올림픽 개최 이전입니다");
        assertFalse(new Olympic().isSummerOlympicYear(1895),"1895년은 올림픽 개최 이전입니다");
        // true
        assertTrue(new Olympic().isSummerOlympicYear(1896),"1896년은 올림픽 개최년도입니다");
    }

    @Test
    void 올림픽개최년도() {
        int[] years = {1900,1920,1964,1936,2000,2016};
        for (int year : years) {
            assertTrue(new Olympic().isSummerOlympicYear(year), year + "년은 올림픽 개최년도입니다");
        }
    }

}
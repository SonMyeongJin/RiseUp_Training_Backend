package com.example.shopping_application.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void 사년주기이외개최년도() {
        int[] years = {1905,1907,1925,1937,1999,2015};
        for (int year : years) {
            assertFalse(new Olympic().isSummerOlympicYear(year), year + "년은 올림픽 개최년도 아닙니다");
        }
    }

    // Covid19 때문인가..?
    @Test
    void 사년주기아니지만개최년도() {
        assertTrue(new Olympic().isSummerOlympicYear(2021), "특별히 2021년은 올림픽 개최년도입니다");
    }

    @Test
    void 개최확정안된연도() {
        // 2032년까지 개최확정
        assertDoesNotThrow(() -> new Olympic().isSummerOlympicYear(2031));
        assertDoesNotThrow(() -> new Olympic().isSummerOlympicYear(2032));
        // 개최확정된 2032년 이후
        assertThrows(IllegalArgumentException.class, () -> new Olympic().isSummerOlympicYear(2033));
        assertThrows(IllegalArgumentException.class, () -> new Olympic().isSummerOlympicYear(2054));
    }
}
package com.example.junit;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    @org.junit.jupiter.api.Test
    void addTest() {

        // 성공하는 테스트 코드
        assertEquals(4, new Calc().add(2, 2));

        // 실패하는 테스트 코드
        //assertEquals(6, new Calc().add(4, 2));

        // 예외가 발생하는 테스트 코드
        //assertThrows(NumberFormatException.class, () -> new Calc().add(-100, 10), "음수는 나오지 않습니다");

        // 여러개의 테스트를 한번에 실행
        assertAll(() -> assertEquals(4,new Calc().add(2, 2),"두 수의 합은 4입니다"),
                () -> assertEquals(6,new Calc().add(2, 4),"두 수의 합은 6입니다") );

    }
}
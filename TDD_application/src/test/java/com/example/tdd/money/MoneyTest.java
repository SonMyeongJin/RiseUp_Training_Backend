package com.example.tdd.money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    // 달러 곱셈이 되는가?
    @Test
    public void testMultiplication() {
        // five라는 객에에 amount 5를 넣어 생성
        Money five = Money.dollar(5);

        //five라는 객체의 amount=5 에 2를 곱한 값을 새로운 product 라는 객체에 저장
        Money product = five.times(2);
        assertEquals (new Dollar(10), product);

        // 실패
        // expect : 15
        // actual : 30
        // 위에 만든 product라는 객체에 five 객체의 amount 5에 3을 곱한 값을 덮어씀
        product = five.times(3);
        assertEquals (new Dollar(15), product);
    }

    // 돈이 같은지 비교되는가?
    @Test
    public void  testEquality() {
        // 객체가 다르기 때문에 실패 -> 클래스에서 오버라이드 해줘야됨
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        // 금액이 다르기 때문에 False 여야 하지만 오류나기때문에 equals 함수 리펙토링 해야됨
        assertFalse(new Dollar(5).equals(new Dollar(10)));

        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(10)));

        // 다른 화폐 단위를 비교하고싶어.
        assertFalse(Money.dollar(5).equals(Money.franc(5)));
    }

    // 프랑스 화폐 곱셈이 되는가?
    @Test
    public void testFrancMultiplication() {
        Franc franc = new Franc(5);
        assertEquals(new Franc(10), franc.times(2));
        assertEquals(new Franc(15), franc.times(3));
    }
}

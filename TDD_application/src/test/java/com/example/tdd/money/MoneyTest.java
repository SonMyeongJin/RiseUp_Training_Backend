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
//        assertEquals (new Dollar(10), product);

        // 실패
        // expect : 15
        // actual : 30
        // 위에 만든 product라는 객체에 five 객체의 amount 5에 3을 곱한 값을 덮어씀
        product = five.times(3);
//        assertEquals (new Dollar(15), product);
    }

    // 돈이 같은지 비교되는가?
    @Test
    public void  testEquality() {
//        // 객체가 다르기 때문에 실패 -> 클래스에서 오버라이드 해줘야됨
//        assertTrue(new Dollar(5).equals(new Dollar(5)));
//        // 금액이 다르기 때문에 False 여야 하지만 오류나기때문에 equals 함수 리펙토링 해야됨
//        assertFalse(new Dollar(5).equals(new Dollar(10)));
//
//        assertTrue(new Franc(5).equals(new Franc(5)));
//        assertFalse(new Franc(5).equals(new Franc(10)));

        // 다른 화폐 단위를 비교하고싶어.
        assertFalse(Money.dollar(5).equals(Money.franc(5)));
    }

    // 프랑스 화폐 곱셈이 되는가?
    @Test
    public void testFrancMultiplication() {
//        Franc franc = new Franc(5);
//        assertEquals(new Franc(10), franc.times(2));
//        assertEquals(new Franc(15), franc.times(3));
    }

    // 화폐 단위가 맞는가? 달러는 USD, 프랑은 CHF
    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    // 다른 클래스여도 같은 금액이면 같은 돈인가?
//    @Test
//    public void testDifferentClassEquality() {
//        assertTrue(new Money(10,"CHF").equals(new Franc(10,"CHF")));
//    }

    // 더하기 기능 테스트
    @Test
    public void testSimpleAddition() {
//        Money sum  = Money.dollar(5).plus(Money.dollar(5));
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }

    @Test
    public void testPlusReturnsSum() {
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five, sum.augend);
        assertEquals(five, sum.addend);
    }

    @Test
    public void testReduceSum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }

    @Test
    public void testReduceMoney() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }

    // 2프랑 이랑 1달러랑 같은지 비교하는 테스트
    @Test
    public void testReduceDifferentCurrency() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2), "USD");
        assertEquals(Money.dollar(1), result);
    }
}

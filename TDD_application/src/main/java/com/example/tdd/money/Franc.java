package com.example.tdd.money;

public class Franc extends Money {

//    private int amount;
//    private String currency;

    // 생성자로 amount 초기화
    Franc(int amount, String currency) {
//        this.amount = amount;
//        this.currency = currency;
        super(amount, currency);
    }

    // 곱셈 메서드 구현
    Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

//    // equals 메서드 오버라이딩
//    @Override
//    public boolean equals(Object object) {
//        Franc franc = (Franc) object;
//        return amount == franc.amount;
//    }

//    String currency() {
//        return currency;
//    } -> Dollar랑 중복이니까 Money로 옮김

}

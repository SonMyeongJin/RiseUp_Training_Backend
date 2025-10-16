package com.example.tdd.money;

public class Franc extends Money {

//    private int amount;
    private String currency;

    // 생성자로 amount 초기화
    Franc(int amount) {
        this.amount = amount;
        this.currency = "CHF";
    }

    // 곱셈 메서드 구현
    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

//    // equals 메서드 오버라이딩
//    @Override
//    public boolean equals(Object object) {
//        Franc franc = (Franc) object;
//        return amount == franc.amount;
//    }

    String currency() {
        return currency;
    }

}

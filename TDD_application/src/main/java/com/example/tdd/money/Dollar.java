package com.example.tdd.money;

public class Dollar extends Money {

//    private int amount;
//    private String currency;

    Dollar(int amount, String currency) {
//        this.amount = amount;
//        this.currency = currency;
        super(amount, currency);
    }
    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }


//    @Override
//    public boolean equals(Object object) {
//        //객체 비교가 아니라 값 비교를 하기 위해 코드 리펙토링
//        Money money = (Money) object;
//        return amount == money.amount;
//    }

//    String currency() {
//        return currency;
//    } -> Franc랑 중복이니까 Money로 옮김

}

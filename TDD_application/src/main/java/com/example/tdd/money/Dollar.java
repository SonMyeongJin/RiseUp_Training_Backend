package com.example.tdd.money;

public class Dollar {

    private int amount;

    Dollar(int amount) {
        this.amount = amount;
    }
    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }


    @Override
    public boolean equals(Object object) {
        //객체 비교가 아니라 값 비교를 하기 위해 코드 리펙토링
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }

}

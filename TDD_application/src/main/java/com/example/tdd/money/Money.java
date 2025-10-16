package com.example.tdd.money;

abstract class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    abstract Money times(int multiplier);
    //abstract String currency(); -> 중복이니까 추상메소드로 밑에 넘겨주지 말고 여기서 구현하자고
    String currency() {
        return currency;
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    static Money dollar(int amount) {
        return new Dollar(amount,"USD");
    }
    static Money franc(int amount) {
        return new Franc(amount,"CHF");
    }

}

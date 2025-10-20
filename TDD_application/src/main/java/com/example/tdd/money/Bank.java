package com.example.tdd.money;

public class Bank {
    Money reduce(Expression source, String to) {
//        if (source instanceof Money) {
//            return ((Money) source).reduce(to);
//        }
//        Sum sum = (Sum) source;
//        int amount = sum.augend.amount + sum.addend.amount;
//        return new Money(amount, to);
        return source.reduce(this,to);
    }

    void addRate(String from, String to, int rate) {

    }

    int rate(String from, String to) {
        return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
    }
}

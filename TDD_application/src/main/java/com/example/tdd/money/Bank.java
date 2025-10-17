package com.example.tdd.money;

public class Bank {
    Money reduce (Expression source, String to) {
        Sum sum = (Sum) source;
//        int amount = sum.augend.amount + sum.addend.amount;
//        return new Money(amount, to);
        return sum.reduce(to);
    }
}

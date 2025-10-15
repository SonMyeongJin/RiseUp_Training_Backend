package com.example.shopping_application.test_practice.money;

public class Dollar {

    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }
    void times(int multiplier) {
        amount = amount * multiplier;
    }

}

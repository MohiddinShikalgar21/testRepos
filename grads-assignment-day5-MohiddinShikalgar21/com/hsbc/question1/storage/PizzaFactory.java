package com.hsbc.question1.storage;

public class PizzaStoreFactory {
    public static PizzaStore getPizzaStore() {
        return new PizzaStoreImpl();
    }
}

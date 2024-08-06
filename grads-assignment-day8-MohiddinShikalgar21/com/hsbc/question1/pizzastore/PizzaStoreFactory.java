package com.hsbc.question1.pizzastore;

import storage.*;

public class PizzaStoreFactory {
    public static Storage getPizzaStore(int code) {
        switch (code) {
            case 1:
                return new PizzaStorage(); // Implement this as PizzaStoreFileImpl
            case 2:
                return new PizzaListStoreImpl();
            case 3:
                return new PizzaSortedStoreImpl();
            default:
                return new PizzaMapStoreImpl();
        }
    }
}

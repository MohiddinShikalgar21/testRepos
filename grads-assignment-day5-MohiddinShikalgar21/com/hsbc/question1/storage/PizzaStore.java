package com.hsbc.question1.storage;

import com.hsbc.question1.model.Pizza;

public interface PizzaStore {
    void addNewPizza(Pizza pizza);
    Pizza getPizzaByName(String pizzaName);
    Pizza[] getPizzasBySize(int size);
}

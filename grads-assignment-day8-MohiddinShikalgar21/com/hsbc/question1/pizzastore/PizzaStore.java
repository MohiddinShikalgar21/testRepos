package com.hsbc.question1.pizzastore;

import exception.NoPizzaFoundException;
import exception.PizzaAlreadyExistsException;
import model.Pizza;

public interface PizzaStore {
    void addNewPizza(Pizza e) throws PizzaAlreadyExistsException;
    Pizza getPizzaByName(String pizzaname) throws NoPizzaFoundException;
}

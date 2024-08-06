package com.hsbc.question1.storage;

import exception.NoPizzaFoundException;
import exception.PizzaAlreadyExistsException;
import model.Pizza;

public interface Storage {
    void addNewPizza(Pizza e) throws PizzaAlreadyExistsException;
    Pizza getPizzaByName(String pizzaname) throws NoPizzaFoundException;
    Pizza[] getPizzasCountbySize(int size) throws NoPizzaFoundException;
}



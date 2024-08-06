package com.hsbc.question1.storage;

import exception.NoPizzaFoundException;
import exception.PizzaAlreadyExistsException;
import model.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaListStoreImpl implements Storage {
    private List<Pizza> pizzas;

    public PizzaListStoreImpl() {
        this.pizzas = new ArrayList<>();
    }

    @Override
    public void addNewPizza(Pizza e) throws PizzaAlreadyExistsException {
        for (Pizza pizza : pizzas) {
            if (pizza.getName().equals(e.getName())) {
                throw new PizzaAlreadyExistsException("Pizza with the same name already exists.");
            }
        }
        pizzas.add(e);
    }

    @Override
    public Pizza getPizzaByName(String pizzaname) throws NoPizzaFoundException {
        for (Pizza pizza : pizzas) {
            if (pizza.getName().equals(pizzaname)) {
                return pizza;
            }
        }
        throw new NoPizzaFoundException("Pizza not found.");
    }

    @Override
    public Pizza[] getPizzasCountbySize(int size) throws NoPizzaFoundException {
        List<Pizza> result = new ArrayList<>();
        for (Pizza pizza : pizzas) {
            if (pizza.getSize() == size) {
                result.add(pizza);
            }
        }
        if (result.isEmpty()) {
            throw new NoPizzaFoundException("No pizzas found of the specified size.");
        }
        return result.toArray(new Pizza[result.size()]);
    }
}

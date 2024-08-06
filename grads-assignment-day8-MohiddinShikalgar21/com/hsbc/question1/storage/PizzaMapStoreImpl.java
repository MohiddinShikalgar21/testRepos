package com.hsbc.question1.storage;

import exceptions.NoPizzaFoundException;
import exceptions.PizzaAlreadyExistsException;
import model.Pizza;

import java.util.HashMap;
import java.util.Map;

public class PizzaMapStoreImpl implements Storage {
    private Map<String, Pizza> pizzas;

    public PizzaMapStoreImpl() {
        this.pizzas = new HashMap<>();
    }

    @Override
    public void addNewPizza(Pizza e) throws PizzaAlreadyExistsException {
        if (pizzas.containsKey(e.getName())) {
            throw new PizzaAlreadyExistsException("Pizza with the same name already exists.");
        }
        pizzas.put(e.getName(), e);
    }

    @Override
    public Pizza getPizzaByName(String pizzaname) throws NoPizzaFoundException {
        Pizza pizza = pizzas.get(pizzaname);
        if (pizza == null) {
            throw new NoPizzaFoundException("Pizza not found.");
        }
        return pizza;
    }

    @Override
    public Pizza[] getPizzasCountbySize(int size) throws NoPizzaFoundException {
        Map<String, Pizza> result = new HashMap<>();
        for (Pizza pizza : pizzas.values()) {
            if (pizza.getSize() == size) {
                result.put(pizza.getName(), pizza);
            }
        }
        if (result.isEmpty()) {
            throw new NoPizzaFoundException("No pizzas found of the specified size.");
        }
        return result.values().toArray(new Pizza[result.size()]);
    }
}

package com.hsbc.question1.storage;

import exception.NoPizzaFoundException;
import exception.PizzaAlreadyExistsException;
import model.Pizza;

import java.util.Set;
import java.util.TreeSet;

public class PizzaSortedStoreImpl implements Storage {
    private Set<Pizza> pizzas;

    public PizzaSortedStoreImpl() {
        this.pizzas = new TreeSet<>();
    }

    @Override
    public void addNewPizza(Pizza e) throws PizzaAlreadyExistsException {
        if (pizzas.contains(e)) {
            throw new PizzaAlreadyExistsException("Pizza with the same name already exists.");
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
        Set<Pizza> result = new TreeSet<>();
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

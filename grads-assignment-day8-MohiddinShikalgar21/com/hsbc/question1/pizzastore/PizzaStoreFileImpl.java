package com.hsbc.question1.pizzastore;

import exception.NoPizzaFoundException;
import exception.PizzaAlreadyExistsException;
import model.Pizza;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class PizzaStoreFileImpl implements PizzaStore {
    private Pizza[] menu;

    public PizzaStoreFileImpl(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            long count = br.lines().count();
            menu = new Pizza[(int) count];
        }
        initializeMenu(filePath);
    }

    private void initializeMenu(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int index = 0;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0].trim();
                int size = Integer.parseInt(parts[1].trim());
                Date date = new Date();
                menu[index++] = new Pizza(name, size, date);
            }
        }
    }

    @Override
    public void addNewPizza(Pizza e) throws PizzaAlreadyExistsException {
        for (Pizza pizza : menu) {
            if (pizza != null && pizza.getName().equals(e.getName())) {
                throw new PizzaAlreadyExistsException("Pizza with the same name already exists.");
            }
        }
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == null) {
                menu[i] = e;
                return;
            }
        }
    }

    @Override
    public Pizza getPizzaByName(String pizzaname) throws NoPizzaFoundException {
        for (Pizza pizza : menu) {
            if (pizza != null && pizza.getName().equals(pizzaname)) {
                return pizza;
            }
        }
        throw new NoPizzaFoundException("Pizza not found.");
    }
}

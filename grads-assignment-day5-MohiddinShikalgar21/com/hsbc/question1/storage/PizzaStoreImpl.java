package com.hsbc.question1.storage;
import com.hsbc.question1.model.Pizza;
import java.util.ArrayList;

public class PizzaStoreImpl implements PizzaStore {
    private ArrayList<Pizza> pizzas;

    public PizzaStoreImpl() {
        pizzas = new ArrayList<>();
    }

    @Override
    public void addNewPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    @Override
    public Pizza getPizzaByName(String pizzaName) {
        for (Pizza pizza : pizzas) {
            if (pizza.getName().equalsIgnoreCase(pizzaName)) {
                return pizza;
            }
        }
        return null;
    }

    @Override
    public Pizza[] getPizzasBySize(int size) {
        ArrayList<Pizza> filteredPizzas = new ArrayList<>();
        for (Pizza pizza : pizzas) {
            if (pizza.getSize() == size) {
                filteredPizzas.add(pizza);
            }
        }
        return filteredPizzas.toArray(new Pizza[0]);
    }
}


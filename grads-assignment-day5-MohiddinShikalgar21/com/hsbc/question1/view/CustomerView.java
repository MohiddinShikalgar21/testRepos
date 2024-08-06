package com.hsbc.question1.view;

import com.hsbc.question1.storage.PizzaStore;
import com.hsbc.question1.storage.PizzaStoreFactory;
import com.hsbc.question1.model.Pizza;

import java.util.Scanner;

public class CustomerView {
    private PizzaStore pizzaStore;

    public CustomerView() {
        pizzaStore = PizzaStoreFactory.getPizzaStore();
    }

    public void addPizzaDetailsAndStore() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Pizza Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Pizza Size: ");
        int size = scanner.nextInt();

        System.out.print("Enter Pizza Price: ");
        double price = scanner.nextDouble();

        Pizza pizza = new Pizza(name, size, price);
        pizzaStore.addNewPizza(pizza);

        System.out.println("Pizza added successfully.");
    }

    public void displayPizzaDetailsByName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Pizza Name to search: ");
        String name = scanner.nextLine();

        Pizza pizza = pizzaStore.getPizzaByName(name);

        if (pizza != null) {
            System.out.println("Pizza Details: " + pizza);
        } else {
            System.out.println("Pizza not found.");
        }
    }

    public void printPizzaNamesBySize() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Pizza Size to filter: ");
        int size = scanner.nextInt();

        Pizza[] pizzas = pizzaStore.getPizzasBySize(size);

        if (pizzas.length > 0) {
            System.out.println("Pizzas of size " + size + ":");
            for (Pizza pizza : pizzas) {
                System.out.println(pizza.getName());
            }
        } else {
            System.out.println("No pizzas found of size " + size);
        }
    }
}

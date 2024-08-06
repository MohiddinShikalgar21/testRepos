package com.hsbc.question1;

import pizzastore.PizzaStoreFactory;
import storage.Storage;
import model.Pizza;
import exception.NoPizzaFoundException;
import exception.PizzaAlreadyExistsException;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Enter the code for the pizza store implementation (1: File, 2: List, 3: Sorted, 4: Map):");
            int code = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            Storage pizzaStore = PizzaStoreFactory.getPizzaStore(code);

            System.out.println("Enter the name of the new pizza:");
            String name = scanner.nextLine();
            System.out.println("Enter the size of the new pizza:");
            int size = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            Pizza newPizza = new Pizza(name, size, new Date());
            pizzaStore.addNewPizza(newPizza);
            System.out.println("Pizza added successfully!");

            System.out.println("Enter the name of the pizza to search:");
            String searchName = scanner.nextLine();
            Pizza foundPizza = pizzaStore.getPizzaByName(searchName);
            System.out.println("Pizza found: " + foundPizza.getName() + ", Size: " + foundPizza.getSize() + ", Date: " + foundPizza.getInsertionDate());

        } catch (PizzaAlreadyExistsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NoPizzaFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}

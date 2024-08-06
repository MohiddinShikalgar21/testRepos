package com.hsbc.question1.model;

public class Pizza {
    private String name;
    private int size;
    private double price;

    public Pizza(String name, int size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza{name='" + name + "', size=" + size + ", price=" + price + "}";
    }
}

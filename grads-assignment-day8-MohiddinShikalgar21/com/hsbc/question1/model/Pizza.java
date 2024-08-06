package com.hsbc.question1.model;

import java.util.Date;
import java.util.Objects;

public class Pizza implements Comparable<Pizza> {
    private String name;
    private int size;
    private Date insertionDate;

    public Pizza(String name, int size, Date insertionDate) {
        this.name = name;
        this.size = size;
        this.insertionDate = insertionDate;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public Date getInsertionDate() {
        return insertionDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, insertionDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pizza pizza = (Pizza) obj;
        return size == pizza.size && Objects.equals(name, pizza.name) && Objects.equals(insertionDate, pizza.insertionDate);
    }

    @Override
    public int compareTo(Pizza o) {
        return this.name.compareTo(o.name);
    }
}

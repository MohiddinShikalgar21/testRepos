package com.hsbc.question2;

import java.util.Scanner;

public class Circle {
    private double radius;

    // Constructor to accept value of radius from user
    public Circle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        this.radius = scanner.nextDouble();
    }

    // Method to calculate and return the area of the circle
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate and return the perimeter of the circle
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to calculate and return the diameter of the circle
    public double diameter() {
        return 2 * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Area of the circle: " + circle.area());
        System.out.println("Perimeter of the circle: " + circle.perimeter());
        System.out.println("Diameter of the circle: " + circle.diameter());
    }
}
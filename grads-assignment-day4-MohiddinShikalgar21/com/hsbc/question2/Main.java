package com.hsbc.question2;

public class Main {
    public static void main(String[] args) {
        Manageable manageable = new Manager("MS21", 123);

        manageable.startWork();
        manageable.completeWork();
        manageable.generateReport();
        manageable.manage();
    }
}

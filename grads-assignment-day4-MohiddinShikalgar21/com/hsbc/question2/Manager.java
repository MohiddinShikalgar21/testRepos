package com.hsbc.question2;

public class Manager extends Employee implements Manageable {

    public Manager(String name, int id) {
        super(name, id);
    }

    @Override
    public void startWork() {
        System.out.println("Manager " + getName() + " is starting work.");
    }

    @Override
    public void completeWork() {
        System.out.println("Manager " + getName() + " has completed work.");
    }

    @Override
    public void generateReport() {
        System.out.println("Manager " + getName() + " is generating report.");
    }

    @Override
    public void manage() {
        System.out.println("Manager " + getName() + " is managing tasks.");
    }
}

package com.hsbc.question3;

public class Main {
    public static void main(String[] args) {

    	MyThread thread1 = new MyThread();
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();

        try {
            thread1.join(); 
            thread2.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads from part a have finished execution");

        Counter counter = new Counter();
        CounterThread counterThread1 = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);

        counterThread1.start();
        counterThread2.start();

        try {
            counterThread1.join(); 
            counterThread2.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Count: " + counter.getCount());
    }
}

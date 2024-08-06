package com.hsbc.question3;

class ThreadExample {
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

        System.out.println("Both threads have finished execution");
    }
}

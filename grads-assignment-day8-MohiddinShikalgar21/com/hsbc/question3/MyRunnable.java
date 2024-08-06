package com.hsbc.question3;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Implementing Runnable: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

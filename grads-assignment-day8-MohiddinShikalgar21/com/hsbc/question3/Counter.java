package com.hsbc.question3;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " - Count: " + count);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
    }
}

package com.yy.concurrent.synchronize;

/**
 * @date 2024/4/17
 */
public class Counter {
    private int count = 0;

    public void increment() {
        this.count++;
    }

    public void descrement() {
        this.count--;
    }

    public int getCount() {
        return this.count;
    }
}

class TestCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
                System.out.println(Thread.currentThread().getName() + ", count = " + counter.getCount());
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.descrement();
                System.out.println(Thread.currentThread().getName() + ", count = " + counter.getCount());
            }
        });
        t2.start();

        Thread.sleep(1000);
        System.out.println(counter.getCount());
    }
}
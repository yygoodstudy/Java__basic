package com.yy.concurrent;

/**
 * @date 2022/5/4
 */
public class TestThread {

    public static void main(String[] args) {

        Thread1 thread1 = new Thread1();
        thread1.setName("main2-----------");
        thread1.start();

        Thread.currentThread().setName("main1-----------");
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + "<1>" + i);
        }

        for (int i = 1; i <= 100; i++) {
            System.out.println("<3>" + i);
        }
    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + "<2>" + i);
        }
    }
}
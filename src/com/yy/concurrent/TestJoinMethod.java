package com.yy.concurrent;

/**
 * @date 2022/5/5
 */
public class TestJoinMethod {
    static int r1 = 1;
    static int r2 = 2;
    static int r3 = 3;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("t1 is runnable~");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            r1 = 10;
            System.out.println("t1 is stopped");
        }, "t1");
        t1.start();
        t1.join();
        System.out.println("r1 = " + r1);

        Thread t2 = new Thread(() -> {
            System.out.println("t2 is runnable~");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            r2 = 20;
            System.out.println("t2 is stopped");
        }, "t2");
        t2.start();
        t2.join();
        System.out.println("r2 = " + r2);

        Thread t3 = new Thread(() -> {
            System.out.println("t3 is runnable~");
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            r3 = 30;
            System.out.println("t3 is stopped");
        }, "t3");
        t3.start();
        t3.join();
        System.out.println("r3 = " + r3);
    }
}

package com.yy.concurrent;

/**
 * @date 2022/5/5
 */
public class TestImplRunnable {
    public static void main(String[] args) {
        Runnable runnable = () ->
                System.out.println(Thread.currentThread().getName() + " is running");

        Thread t1 = new Thread(runnable, "t1");
        t1.start();

        System.out.println(Thread.currentThread().getName() + " is running");
    }
}

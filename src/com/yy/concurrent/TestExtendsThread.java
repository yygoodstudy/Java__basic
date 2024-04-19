package com.yy.concurrent;

/**
 * @date 2022/5/5
 */
public class TestExtendsThread {
    public static void main(String[] args) {
        new Thread("t1") {
            @Override
            public void run() {
                System.out.println(getName() + " running");
            }
        }.start();

        System.out.println(Thread.currentThread().getName() + " running");
    }
}

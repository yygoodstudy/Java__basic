package com.yy.concurrent;

/**
 * @date 2024/4/18
 */
public class TestJingTai {
    private static int index = 0;
    private static Object lock = new Object();

    static class MyThread extends Thread {
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(getName() + ":" + ++index);
                }
            }

        }
    }

    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
    }
}

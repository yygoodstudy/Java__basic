package com.yy.concurrent;

/**
 * @date 2022/5/4
 */
public class Main {
    public static void main(String[] args) {
//        Thread t1 = new MyThread();
//        t1.setName("hello");
//        Thread t2 = new MyThread();
//        t2.setName("world");
//        Thread t3 = new MyThread();
//        t3.setName("Java");
//        t1.start();
//        t2.start();
//        t3.start();

        MyThread2 myThread2 = new MyThread2();
        Thread rt1 = new Thread(myThread2, "rt1");
        Thread rt2 = new Thread(myThread2, "rt2");
        rt1.start();
        rt2.start();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + ": " + i);
        }
    }
}

class MyThread2 implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

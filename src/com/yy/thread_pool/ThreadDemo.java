package com.yy.thread_pool;

/**
 * 创建线程的方式1：继承Thread类
 *
 * @date 2024/4/6
 */
public class ThreadDemo extends Thread {

    private String name;

    public ThreadDemo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        new ThreadDemo("thread1").run();
        new ThreadDemo("thread2").start();

    }
}

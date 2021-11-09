package com.yy.extend;

import java.util.concurrent.Callable;

/**
 * @Date 2021/9/12 20:43
 */
public class ThreadA extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(500); // 模拟做事情执行了500ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("这是线程A");
    }
}

class ThreadB implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(500); // 模拟做事情执行了500ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("这是线程B");
    }
}

class ThreadC implements Callable<String>{
    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(500); // 模拟做事情执行了500ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("这是线程C");
        return "Thread C";
    }
}

package com.yy.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @date 2024/4/6
 */
public class MyTask implements Runnable{
    int i = 0;

    public MyTask(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--"+i);
        try {
            Thread.sleep(1000); // 业务逻辑
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Main{
    public static void main(String[] args) {
        ExecutorService executorService1 = Executors.newCachedThreadPool(); // 很快
        ExecutorService executorService2 = Executors.newFixedThreadPool(10); // 中等
        ExecutorService executorService3 = Executors.newSingleThreadExecutor(); // 很慢

        for (int i = 0; i < 100; i++) {
            executorService1.submit(new MyTask(i));
        }

    }
}

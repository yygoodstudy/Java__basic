package com.yy.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @date 2022/5/5
 */
public class TestCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask<>(() -> {
            System.out.println(Thread.currentThread().getName() + " is running~");
            Thread.sleep(1000);
            return 10;
        });
        Thread tt = new Thread(task); // 将FutureTask传给Thread类
        tt.start(); // 启动线程
        Integer number = task.get(); // 获取线程执行结果
        System.out.println("number = " + number);
    }
}
class myCallable implements Callable{
    @Override
    public Object call() throws Exception {
        System.out.println("callable running ~");
        String name = Thread.currentThread().getName();
        System.out.println("name = " + name);
        return new Object();
    }
}
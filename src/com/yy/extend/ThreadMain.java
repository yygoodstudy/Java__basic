package com.yy.extend;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Date 2021/9/12 20:44
 */
public class ThreadMain {
    public static void main(String[] args) {
        ThreadA ta = new ThreadA();
        ta.start();
        new Thread(()-> System.out.println("这是线程B!")).start();

        FutureTask<String> futureTask = new FutureTask<>(new ThreadC());
        new Thread(futureTask).start();
        System.out.println("这是主线程：begin!");
        try {
            System.out.println("得到的返回结果是："+futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("这是主线程：end!");
    }
}

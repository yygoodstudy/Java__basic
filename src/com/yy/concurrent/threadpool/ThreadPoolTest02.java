package com.yy.concurrent.threadpool;

import java.util.concurrent.*;

/**
 * 线程池
 * 通过ThreadPoolExecutor创建一个线程池对象
 * 推荐使用这种方法创建线程池
 *
 * @date 2024/4/19
 */
public class ThreadPoolTest02 {

    /*
        临时线程什么时候创建？
          新任务提交时，发现核心线程都在忙，任务队列也满了，并且还可以创建临时线程，此时才会创建临时线程
        什么时候开始拒绝新任务？
          核心线程和临时线程都在忙，任务队列也满了，新的任务过来的时候才会开始拒绝新任务；
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 创建一个线程池
        ExecutorService pool = new ThreadPoolExecutor(3, // 核心线程数
                5, // 最大线程数
                8, // 空闲线程的最大存活时间
                TimeUnit.SECONDS, // 存活时间的单位
                new ArrayBlockingQueue<>(4), // 存放任务的队列，最多只能存放4个任务
                Executors.defaultThreadFactory(), // 创建线程的工厂
                new ThreadPoolExecutor.AbortPolicy() // 当任务太多时，处理不过来的拒绝策略
        );

        // 执行实现了Callback任务的线程
        Future<String> future1 = pool.submit(new MyCallable(100)); // 执行callable任务，需要使用submit方法，通过future接收处理的结果
        Future<String> future2 = pool.submit(new MyCallable(200)); // 执行callable任务，需要使用submit方法，通过future接收处理的结果
        Future<String> future3 = pool.submit(new MyCallable(300)); // 执行callable任务，需要使用submit方法，通过future接收处理的结果
        Future<String> future4 = pool.submit(new MyCallable(400)); // 执行callable任务，需要使用submit方法，通过future接收处理的结果
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
        System.out.println(future4.get()); // 上面三个核心线程用完了，这个任务复用上面的线程来处理

        pool.shutdown(); // 等待线程池中的所有任务执行完后关闭线程池

    }
}

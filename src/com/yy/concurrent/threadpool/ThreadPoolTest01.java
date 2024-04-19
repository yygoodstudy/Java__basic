package com.yy.concurrent.threadpool;

import java.util.concurrent.*;

/**
 * 线程池
 * 通过ThreadPoolExecutor创建一个线程池对象
 *
 * @date 2024/4/19
 */
public class ThreadPoolTest01 {

    /*
        临时线程什么时候创建？
          新任务提交时，发现核心线程都在忙，任务队列也满了，并且还可以创建临时线程，此时才会创建临时线程
        什么时候开始拒绝新任务？
          核心线程和临时线程都在忙，任务队列也满了，新的任务过来的时候才会开始拒绝新任务；
     */
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(3, // 核心线程数
                5, // 最大线程数
                8, // 空闲线程的最大存活时间
                TimeUnit.SECONDS, // 存活时间的单位
                new ArrayBlockingQueue<>(4), // 存放任务的队列，最多只能存放4个任务
                Executors.defaultThreadFactory(), // 创建线程的工厂
                new ThreadPoolExecutor.AbortPolicy() // 当任务太多时，处理不过来的拒绝策略
        );

        // 创建任务
        MyRunnableTask task = new MyRunnableTask();
        pool.execute(task); // 线程池会自动的创建一个新线程，来自动的处理这个任务，自动执行
        pool.execute(task); // 创建以下多个任务
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);


        pool.submit(task);

        pool.shutdown(); // 等待线程池中的所有任务执行完后关闭线程池

//        pool.shutdownNow(); // 立即关闭线程池，无论任务是否执行完毕！！

    }
}

// 创建一个任务
class MyRunnableTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": 输出666");
    }

}
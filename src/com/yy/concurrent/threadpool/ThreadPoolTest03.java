package com.yy.concurrent.threadpool;

import java.util.concurrent.*;

/**
 * 线程池
 * 通过ThreadPoolExecutor创建一个线程池对象
 * 但是不推荐使用这种方式创建线程池，因为这个方式创建的线程池要么对任务的数量没有限制，
 * 要么对创建的线程数没有限制，如果并发量很高很可能会导致OOM风险，也就是内存溢出
 *
 * @date 2024/4/19
 */
public class ThreadPoolTest03 {

    /*
       创建线程池的第二种方法：
        通过Executors工具类创建具有不同特征的线程池
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 创建一个线程池
//        ExecutorService pool = Executors.newFixedThreadPool(3); // 创建具有固定数量线程数的线程池
//        ExecutorService executorService = Executors.newSingleThreadExecutor();  // 创建只有一个核心线程数的线程池
        ExecutorService pool = Executors.newCachedThreadPool(); // 每新增一个任务就会创建一个新的线程来执行该任务

        // 执行实现了Callback任务的线程
        Future<String> future1 = pool.submit(new MyCallable(100)); // 执行callable任务，需要使用submit方法，通过future接收处理的结果
        Future<String> future2 = pool.submit(new MyCallable(200));
        Future<String> future3 = pool.submit(new MyCallable(300));
        Future<String> future4 = pool.submit(new MyCallable(400));
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
        System.out.println(future4.get());

        pool.shutdown(); // 等待线程池中的所有任务执行完后关闭线程池

    }
}

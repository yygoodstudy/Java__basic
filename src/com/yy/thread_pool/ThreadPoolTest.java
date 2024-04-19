package com.yy.thread_pool;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @date 2024/4/6
 */
public class ThreadPoolTest {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 100000; i++) {
            executorService.submit(() -> numbers.add(random.nextInt()));
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
        long end = System.currentTimeMillis();
        System.out.println("size = " + numbers.size());
        System.out.println("耗时：" + (end - start));
    }
}

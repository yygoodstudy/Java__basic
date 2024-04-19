package com.yy.thread_pool;

import java.util.ArrayList;
import java.util.Random;

/**
 * @date 2024/4/6
 */
public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            Thread thread = new Thread(() -> {
                numbers.add(random.nextInt());
            });
            thread.start();
            thread.join();
        }
        long end = System.currentTimeMillis();
        System.out.println("size = " + numbers.size());
        System.out.println("耗时：" + (end - start));
    }
}

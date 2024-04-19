package com.yy.concurrent.threadpool;

import java.util.concurrent.Callable;

/**
 * @date 2024/4/19
 */
public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        // 求1-n的和
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "求出了 1-" + n + " 的和为：" + sum;
    }
}

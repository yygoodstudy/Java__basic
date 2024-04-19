package com.yy.concurrent;

/**
 * ThreadLocal保证了共享变量的线程安全问题
 *
 * @date 2024/4/17
 */
public class ThreadLocalTest {

    static class MyThreadLocal {
        private final ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        public void setLocalValue(Integer value) {
            threadLocal.set(value);
        }

        public Integer getThreadLocalVal() {
            return threadLocal.get();
        }
    }

    public static void main(String[] args) {
        MyThreadLocal myThreadLocal = new MyThreadLocal();
        new Thread(() -> {
            myThreadLocal.setLocalValue(10);
            System.out.println(myThreadLocal.getThreadLocalVal());
        }).start();

        new Thread(() -> {
            myThreadLocal.setLocalValue(20);
            System.out.println(myThreadLocal.getThreadLocalVal());
        }).start();
    }
}

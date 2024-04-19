package com.yy.concurrent.synchronize;

/**
 * @date 2024/4/17
 */
public class Printer {

    public static synchronized void print() {
        while (true) { // synchronized方法内部是一个死循环，一旦一个线程执行到这个同步方法，持有锁之后就不会释放这个锁了
            System.out.println(Thread.currentThread().getName());
        }
    }
}

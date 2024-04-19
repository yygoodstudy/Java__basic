package com.yy.concurrent.lock;

import java.util.concurrent.TimeUnit;

/**
 * 只有已经获取锁的线程，才可以调用锁的wait()、notify()方法，否则会抛出异常IllegalMonitorStateException
 *
 * @date 2024/4/17
 */
public class WaitDemo {

    public static void main(String[] args) {
        Object lock = new Object();
        Thread A = new Thread(() -> {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " 线程获得了锁");
                try {
                    System.out.println("休眠一会儿...");
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("调用wait方法...当前线程状态：" + Thread.currentThread().getState());
                try {
                    lock.wait(); // 调用wait方法当前线程会释放锁，且释放cpu占用资源
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " 线程被唤醒....后当前线程状态：" + Thread.currentThread().getState());
            }
        }, "A");

        A.start();

        new Thread(() -> {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " 线程获取到了锁");
                lock.notify(); // 唤醒在此lock锁上等待的线程
                Thread.State state = A.getState();
                System.out.println("B 线程执行notify方法后，A线程状态：" + state);
            }
        }, "B").start();

        Thread.State state = A.getState();
        System.out.println("B 线程执行结束后，A线程状态：" + state);
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

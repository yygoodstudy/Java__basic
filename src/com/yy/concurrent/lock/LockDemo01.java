package com.yy.concurrent.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock锁的使用
 * @date 2024/4/19
 */
public class LockDemo01 {

    private static final Account account = new Account(100);
    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        double money = getMoney();
        System.out.println("money = " + money);
    }


    static class Account {
        private double money;

        public double getMoney() {
            return money;
        }

        public Account(double money) {
            this.money = money;
        }

        public void increment() {
            this.money++;
        }

        public void disIncrement() {
            this.money--;
        }
    }

    static double getMoney() {
        new Thread(() -> {
            lock.lock(); // 加锁
            try {
                for (int i = 0; i < 10; i++) {
                    account.increment();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();  // 释放锁
            }
        }).start();


        new Thread(() -> {
            lock.lock(); // 加锁
            try {
                for (int i = 0; i < 10; i++) {
                    account.disIncrement();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();  // 释放锁
            }
        }).start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return account.getMoney();
    }
}

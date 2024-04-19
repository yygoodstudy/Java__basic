package com.yy.concurrent;

/**
 * 简易的计数器
 *
 * @date 2024/4/17
 */
public class SimpleTimer {
    private static int count;

    public static void main(String[] args) {
        count = args.length >= 1 ? Integer.parseInt(args[0]) : 10; // count = 10
        while (true) {
            if (count < 0) {
                break;
            } else {
                System.out.println("火箭发射倒计时剩余： " + countDown() + " 秒");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("点火发射！");
    }

    private static int countDown() {
        return count--;
    }
}

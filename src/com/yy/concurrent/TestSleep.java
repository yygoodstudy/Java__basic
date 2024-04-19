package com.yy.concurrent;

/**
 * @date 2022/5/5
 */
public class TestSleep {
    static int r = 0;

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        Thread t = new Thread(() -> {
            System.out.println("开始");
            try {
                Thread.sleep(1);
                System.out.println("我休眠了....");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束");
            r = 10;
        });
        t.start();
        try {
            t.join(); // 让调用该方法的线程执行完run方法之后，主线程再执行join()后面的代码
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("r = " + r);// 如何让r的输出结果为10？
        // 解决方案有两个：
        // (1):可以通过sleep方法，让主线程休眠一段时间，等待t线程执行结束，但是不确定要休眠多长时间t线程才能执行结束。
        // (2)通过join方法，
    }
}

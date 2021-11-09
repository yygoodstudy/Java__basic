package com.yy.java8;

/**
 * @Date 2021/9/12 0:48
 */
public class SimpleLambda {

    public static void main(String[] args) {
        new Thread(new Runnable() { // 1.匿名内部类
            @Override
            public void run() {
                System.out.println("hello world~~~");
            }
        }).start();

        new Thread(() -> System.out.println("hello world with lambda")).start(); // 2.Lambda表达式

    }
}

@FunctionalInterface
interface MyRun extends Runnable {
    default void run2(String name, int age) {
        System.out.println("name:" + name + ",age:" + age);
    }

    String toString();
}
package com.yy.singleton.atguigu;

/**
 * @date 2024/4/6
 */
public class TestSingleton {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.SINGLETON_1;
        Singleton2 singleton2 = Singleton2.SINGLETON;
        System.out.println("singleton = " + singleton1);
        System.out.println("singleton1 = " + singleton2);
        System.out.println("singleton3 = " + Singleton3.SINGLETON_3);

    }
}

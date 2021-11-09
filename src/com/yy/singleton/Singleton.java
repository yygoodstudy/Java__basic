package com.yy.singleton;

/**
 * @Date 2021/11/4 17:16
 * 饿汉式，线程安全，可用
 */
public class Singleton {
    private static final Singleton SINGLETON = new Singleton();

    private Singleton() {
    }

    public static Singleton singleton() {
        return SINGLETON;
    }
}

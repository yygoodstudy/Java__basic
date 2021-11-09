package com.yy.singleton;

/**
 * 饿汉式：（静态常量 线程安全 可用）
 * 优点：这种写法比较简单，就是在类装载的时候就完成了实例化。避免了线程同步问题
 * 缺点：没有达到延迟加载的效果。如果从始至终都没有使用过这个实例，则会造成内存的浪费。
 */
public class Singleton1 {
    private static final Singleton1 SINGLETON_1;

    static {
        SINGLETON_1 = new Singleton1();
    }

    private Singleton1() {
    }

    public static Singleton1 singleton1() {
        return SINGLETON_1;
    }


}

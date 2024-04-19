package com.yy.singleton.atguigu;

/**
 * 懒汉式(线程安全的懒汉式单例模式)
 * 1. 构造器私有化
 * 2. 创建一个私有的静态变量
 * 3. 提供一个公开的静态方法用于给这个静态变量赋值并返回这个静态变量
 *
 * @date 2024/4/6
 */
public class Singleton5 {
    private static Singleton5 singleton5;

    private Singleton5() {}

    public static Singleton5 getSingleton4() {
        if (singleton5 == null) { // 2.双重非空判断
            synchronized (Singleton5.class) { // 2.添加synchronized块
                if (singleton5 == null) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    singleton5 = new Singleton5();
                }
            }
        }
        return singleton5;
    }
}

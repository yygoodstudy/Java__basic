package com.yy.singleton.atguigu;

/**
 * 懒汉式
 * 1. 构造器私有化
 * 2. 创建一个私有的静态变量
 * 3. 提供一个公开的静态方法用于给这个静态变量赋值并返回这个静态变量
 * 4. 会有线程安全问题，多个线程获取到的singleton4可能不是一个
 *
 * @date 2024/4/6
 */
public class Singleton4 {
    private static Singleton4 singleton4;

    private Singleton4() {}

    public static Singleton4 getSingleton4() {

        if (singleton4 == null) {
            // 会有线程安全问题，如果有多个线程同时进来，可能会创建多个Singleton4实例
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            singleton4 = new Singleton4();
        }
        return singleton4;
    }
}

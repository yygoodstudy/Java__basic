package com.yy.singleton;

/**
 * @Date 2021/11/4 17:44
 * 双重检查
 * 优点：线程安全，延迟加载。效率较高
 */
public class Singleton4 {
    private static Singleton4 singleton4;

    private Singleton4() {
    }

    public static Singleton4 singleton4() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}

package com.yy.array;

/**
 * @date 2021/12/1
 */
public class Singleton {
    private static volatile Singleton SINGLETON = null;

    private Singleton() {
    }

    public static Singleton singleton() {
        if (SINGLETON == null) {
            synchronized (Singleton.class) {
                if (SINGLETON == null) {
                    SINGLETON = new Singleton();
                }
            }
        }
        return SINGLETON;
    }
}

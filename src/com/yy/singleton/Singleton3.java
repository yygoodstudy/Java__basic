package com.yy.singleton;

/**
 * @Date 2021/11/4 17:39
 * 懒汉式，线程安全，但是效率太低。不推荐使用
 */
public class Singleton3 {
    private static Singleton3 singleton3;

    private Singleton3() {
    }

    public synchronized static Singleton3 singleton3() {
        if (singleton3 == null)
            singleton3 = new Singleton3();
        return singleton3;
    }
}

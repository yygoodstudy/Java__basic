package com.yy.singleton;

/**
 * @Date 2021/11/4 17:33
 * 懒汉式（线程不安全，不可用）：起到了延迟加载的效果。但是只能在单线程环境下使用。因为这种写法在多线程的情况下会有线程安全问题。
 */
public class Singleton2 {
    public static Singleton2 singleton2;

    private Singleton2() {
    }

    public static Singleton2 singleton2() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}

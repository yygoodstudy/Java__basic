package com.yy.concurrent;

/**
 * @date 2022/5/5
 */
public class TestFrames {
    public static void main(String[] args) {
        method1(2);
    }

    private static void method1(int x) {
        int y = x + 1;
        Object o = method2();
        System.out.println(o);
    }

    private static Object method2() {
        Object o = new Object();
        return o;
    }
}

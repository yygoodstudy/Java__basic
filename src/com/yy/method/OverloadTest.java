package com.yy.method;

/**
 * 方法重载:
 * 1,方法名必须相同
 * 2,参数列表不同（参数个数，参数类型，具有不同类型顺序不同）
 *
 * @Date 2021/5/23 15:08
 */
public class OverloadTest {
    public static void main(String[] args) {
        System.out.println("args.length = " + args.length);
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println("max(1,2) = " + max(1, 2));
        System.out.println("max(1,2,3) = " + max(1, 2, 3));
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int max(int a, int b, int c) {
        int m = a > b ? a : b; // m = 2
        return m > c ? m : c;
    }

    // 1.参数个数不同
    static void method(int x){
        System.out.println("x = " + x);
    }

    static void method(int x, int y){
        System.out.println("x="+x+",y="+y);
    }

    // 2.参数类型不同
    static void method(double x){
        System.out.println(x);
    }

    // 3.参数顺序不同
    static void method(int x, double y) {
        System.out.println("x=" + x + ",y=" + y);
    }

    static void method(double x, int y) {
        System.out.println("x=" + x + ",y=" + y);
    }
}


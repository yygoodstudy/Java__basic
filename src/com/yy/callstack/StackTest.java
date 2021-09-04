package com.yy.callstack;

/**
 * @Date 2021/8/29 11:12
 */
public class StackTest {
    public static void main(String[] args) {
        greet("zz");
    }

    public static void greet(String name) {
        System.out.println("hello," + name + "!");
        greet2(name);
        bye();
    }

    public static void greet2(String name) {
        System.out.println("how are you " + name + "?");
    }

    public static void bye() {
        System.out.println("bye~~~");
    }
}

package com.yy.array;

import java.util.Arrays;

/**
 * @Date 2021/6/4 19:31
 */
public class A {
    @Override
    public String toString() {
        return String.valueOf(Math.random());
    }
}

class NewVarArgs {
    static void printArray(Object... args) {
        for (Object arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(45, 3.14F, false);
        printArray("one", "two", "three", "four");
        printArray(new A(), Arrays.toString(new A[]{new A(), new A(), new A()}));
    }
}

class OptionalTrailingArguments {
    static void f(int required, String... trailing) {
        System.out.println("required = " + required);
        for (String s : trailing) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "one");
        f(2, "one", "two");
        f(0);
    }
}

class OverloadingVarargs {
    static void f(Character... args) {
        System.out.print("one ");
        for (Character arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }

    static void f(Integer... args) {
        System.out.print("two ");
        for (Integer arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }

    static void f(Long... args) {
        System.out.print("three ");
        for (Long arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f('a', 'b', 'c');
        f(1);
        f(2, 1);
        f(0);
        f(0L);
    }
}
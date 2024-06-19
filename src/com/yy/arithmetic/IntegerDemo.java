package com.yy.arithmetic;

/**
 * @date 2024/4/17
 */
public class IntegerDemo {
    public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b = 3;
        System.out.println(a == b); // false

        Integer c = new Integer(127);
        Integer d = 127;
        System.out.println(c == d); // false;
    }
}

package com.yy.array;

import java.util.Arrays;

/**
 * @Date 2021/6/4 19:20
 */
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {new Integer(1), new Integer(2)};
        Integer[] b = new Integer[]{new Integer(3), new Integer(4)};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}

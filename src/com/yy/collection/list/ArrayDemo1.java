package com.yy.collection.list;

import java.util.Arrays;

/**
 * @date 2024/4/16
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3, 9, 5};
        Arrays.stream(nums).forEach(System.out::print);
        Arrays.sort(nums);
        System.out.println();
        Arrays.stream(nums).forEach(System.out::print);
    }
}

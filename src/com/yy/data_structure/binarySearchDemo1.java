package com.yy.data_structure;

import java.util.Arrays;

/**
 * 二分查找
 *
 * @date 2024/4/19
 */
public class binarySearchDemo1 {

    public static void main(String[] args) {
        int[] nums = {10, 4, 3, 20, 5, -3, 1, 9, 3};
        int[] ints = arraySort(nums);
        System.out.println(Arrays.toString(ints));

//        int index = binarySearch(ints, 5, 0, ints.length - 1);
        int index = binarySearch(ints, 10);
        System.out.println("index = " + index);



    }

    /**
     * 冒泡排序
     *
     * @param numbers 给定的数组
     * @return 由小到大排好序的数组
     */
    public static int[] arraySort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] >= numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }

    /**
     * 二分查找递归实现，找到元素则返回元素下标，找不到则返回-1
     *
     * @param numbers 指定的从小到大排好序的数组
     * @param target  要查询的元素
     * @param i       最开始数组的起始下标
     * @param j       最开始数组的终止下标
     * @return 需要查找的元素所在的索引
     */
    public static int binarySearch(int[] numbers, int target, int i, int j) {
        int middleIndex = (i + j) / 2;
        if (target > numbers[middleIndex]) {
            i = middleIndex + 1;
            return binarySearch(numbers, target, i, j);
        }
        if (target < numbers[middleIndex]) {
            j = middleIndex - 1;
            return binarySearch(numbers, target, i, j);
        }
        if (target == numbers[middleIndex]) {
            return middleIndex;
        }
        return -1;
    }

    // hello world 3F7DA7

    /**
     * while循环实现二分查找
     *
     * @param numbers 指定的从小到大排好序的数组
     * @param target  目标值
     * @return 查找到的索引，未找到返回-1
     */
    public static int binarySearch(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (target > numbers[m]) {
                i = m + 1;
            } else if (target < numbers[m]) {
                j = m - 1;
            } else if (target == numbers[m]) {
                return m;
            }
        }
        return -1;
    }
}

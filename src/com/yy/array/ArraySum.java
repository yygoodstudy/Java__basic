package com.yy.array;

/**
 * @Date 2021/6/1 21:44
 * 数组求和
 */
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = getArraySum(arr);
        System.out.println("sum = " + sum);
        int[] arr1 = {};
        int arraySum = getArraySum(arr1);
        System.out.println("arraySum = " + arraySum);
    }

    public static int getArraySum(int[] arr) {
        if (arr != null && arr.length > 0) {
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            return sum;
        } else {
            System.out.println("传入的数组的长度为0或者数组为null");
            return 0;
        }

    }
}

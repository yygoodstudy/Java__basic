package com.yy.array;

import java.util.Arrays;

/**
 * @date 2024/4/16
 */
public class Kmax {

    public static void main(String[] args) {
        int[] numbers = {1, 9, 520, 999, 22, 10, 11, 52, 8, 5};
        int[] ints = arraySort(numbers);
        System.out.println("排序后的数组为：" + Arrays.toString(ints));
        int k = 3;
        int kMax = getKMax(k, ints);
        System.out.println("第【" + k + "】个最大的值为：【" + kMax + "】");

        int[] numbers1 = {1, 9, 520, 99, 55, 10, 11, 52, 8, 5};
        int[] arr = arraySort(numbers1);
        System.out.println("排序后的数组为：" + Arrays.toString(arr));
        int kMaxPlus = getKMaxPlus(k, arr);
        System.out.println("第【" + k + "】个最大的值为：【" + kMaxPlus + "】");
    }

    /**
     * 对给定的数组按照从小到大顺序排序
     *
     * @param numbers 整数类型数组
     * @return 排好序的数组
     */
    public static int[] arraySort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }

    /**
     * 求数组的第k个最大值
     *
     * @param k       ：表示第几个元素
     * @param numbers ：整数类型数组
     * @return 第k个最大值
     */
    public static int getKMax(int k, int[] numbers) {
        if (k < 1) {
            throw new RuntimeException("K表示第几个元素,k的值不能小于1");
        }
        if (k > numbers.length) {
            throw new RuntimeException("k的值不能超过数组的长度" + numbers.length);
        }
        return arraySort(numbers)[k - 1];
    }

    // 第二种实现方式
    public static int getKMaxPlus(int k, int[] numbers) {
        if (k < 1) {
            throw new RuntimeException("K表示第几个元素,k的值不能小于1");
        }
        int[] newNumbers = new int[k];
        int size = k - 1;
        for (int i = 0; i <= size; i++) {
            newNumbers[i] = numbers[i];
        }
        int[] ints = arraySort(newNumbers); // 存放前k个元素并按照降序排列
        int[] others = new int[numbers.length - k];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) { // 将剩下的元素放入到others这个数组里
            if (i > k - 1) {
                others[index++] = numbers[i];
            }
        }
        // 将前k个排好序的元素放入到临时数组中
        int[] tempArr = new int[k + 1];
        for (int i = 0; i < ints.length; i++) {
            tempArr[i] = ints[i];

        }
        // 最终的数组
        int[] finalArr = new int[k];
        // 先将第一次排好序的k个元素存入最终数组中
        for (int i = 0; i < finalArr.length; i++) {
            finalArr[i] = ints[i];
        }

        // 将剩下的元素逐个读取，如果新元素小于之前数组的第k个元素，则不管，如果大于，则将它放入到临时数组的最后一个位置上；
        // 然后对临时数组进行排序，同时去掉最后一个最小的元素，将前面几个元素放入到最终的数组里；依次类推；
        // 循环结束后，第k个元素就是我们要的结果
        for (int i = 0; i < others.length; i++) {
            if (others[i] > ints[size]) {
                tempArr[k] = others[i];
                int[] sortedArr = arraySort(tempArr);
                for (int j = 0; j < sortedArr.length; j++) {
                    if (j < k) {
                        finalArr[j] = sortedArr[j];
                    }
                }
            }
        }

        return finalArr[size];
    }
}

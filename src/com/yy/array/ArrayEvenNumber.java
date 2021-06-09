package com.yy.array;

/**
 * @Date 2021/6/1 22:04
 * 求偶数个数
 */
public class ArrayEvenNumber {
    public static void main(String[] args) {
        String arrayEvenNumber = getArrayEvenNumber(new int[]{1, 2, 3, 4, 5});
        System.out.println(arrayEvenNumber);
    }

    public static String getArrayEvenNumber(int[] arr) {
        int evenNumberCount = 0; // 偶数个数
        for (int i : arr) {
            if (i % 2 == 0) {
                evenNumberCount++;
            }
        }
        int oddNumberCount = arr.length - evenNumberCount;

        return "偶数个数为：" + evenNumberCount + ",奇数个数为：" + oddNumberCount;
    }
}

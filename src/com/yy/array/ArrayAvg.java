package com.yy.array;

import java.math.BigDecimal;

/**
 * @Date 2021/6/1 21:51
 * 数组求平均值并保留两位小数
 */
public class ArrayAvg {

    public static void main(String[] args) {
        int[] arr = {1,2,2,2};
        double arrayAverage = getArrayAverage(arr);
        System.out.println("arrayAverage = " + arrayAverage);
        double a = (float)5/3;
        System.out.println(a);
    }

    public static double getArrayAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0.0;
        } else {
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            BigDecimal bg = new BigDecimal((float)sum/arr.length);
            double f1 = bg.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
            return f1;
        }
    }
}

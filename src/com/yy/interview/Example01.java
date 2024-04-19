package com.yy.interview;

import java.util.Arrays;

/**
 * 方法的传参机制：
 * 基本数据类型传递的是值，引用数据类型传递的是地址值；
 * 特殊的类型：String和包装类都具有不可变性，每次变化都会生成新的对象
 * @date 2024/4/6
 */
public class Example01 {

    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        Integer number = 200;
        int[] arr = {1, 2, 3, 4, 5};
        MyData myData = new MyData();

        change(i, str, number, arr, myData);

        System.out.println("i = " + i); // 1
        System.out.println("str = " + str); // hello
        System.out.println("number = " + number); // 200
        System.out.println("arr = " + Arrays.toString(arr)); // 2,2,3,4,5
        System.out.println("myData.a = " + myData.a); // 11
    }

    public static void change(int j, String s, Integer n, int[] a, MyData m) {
        j += 1;
        s += "world"; // 这里的s已经指向了新的地址
        n += 1;
        a[0] += 1;
        m.a += 1;
    }
}

class MyData {
    int a = 10;
}
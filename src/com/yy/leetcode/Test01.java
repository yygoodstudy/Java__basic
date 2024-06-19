package com.yy.leetcode;

import java.util.Arrays;

/**
 * @date 2024/6/19
 */
public class Test01 {
    public static void main(String[] args) {
//        如字符串“hello world, hello eclipse, hello idea, hello spring”,统计出“hello”出现的次数

//        String str = "hello world, hello eclipse, hello idea, hello spring";
//        int count = countStr(str, "hello");
//        System.out.println("hello 字符串在目标字符串中出现的次数为：" + count);


        int number = fn(8);
        System.out.println("number = " + number);
    }

    /**
     * 统计targetStr目标字符串，在str中出现的次数
     *
     * @param str       原字符串
     * @param targetStr 目标字符串
     * @return 出现次数
     */
    public static int countStr(String str, String targetStr) {
        int count = 0;
        while (true) {
            int index = str.indexOf(targetStr);
            if (index != -1) {
                count++;
                str = str.substring(index + targetStr.length());
            } else {
                break;
            }
        }
        return count;
    }


    /**
     * 随机生成1-100的一个数，直到生成了97这个数，看看你一共统计了多少次？
     *
     * @return 生成次数
     */
    public static int count() {
        int count = 0;
        while (true) {
            int num = (int) (Math.random() * 100) + 1;
            if (num == 97) {
                break;
            }
            count++;
        }
        return count;
    }

    /*
        1 1 2 3 5 8 13 21....，求第n个数是多少
     */
    public static int fn(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else
            return fn(n - 1) + fn(n - 2);
    }
}

class T {
    public static void main(String[] args) {
        String str = "ok";
        char[] chs = {'g', 'b', 'k'};
        T t = new T();
        t.change(str, chs);
        System.out.println(str);
        System.out.println(Arrays.toString(chs));
    }

    public void change(String str, char[] chs) {
        str = "hello";
        chs[0] = 'a';
    }
}
//输出结果
//str:  ok
// chs: a b k

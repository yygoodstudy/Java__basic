package com.yy.gather;

import java.util.Scanner;

/**
 * @Date 2021/10/15 17:35
 */
public class StringDemo {
    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        System.out.println(str == "hello");

        if (str == "hello") {
            i++;
        }
        System.out.println(++i);
        printStr();
    }

    /**
     * 字符串反转
     */
    public static void printStr() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要反转的字符串：");
        String str = scan.next();
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println("反转后的字符串为：" + sb);
    }
}

package com.yy.java8.lambda_pro;

/**
 * @date 2022/5/24
 */
public class Program {

    public static void main(String[] args) {
        Cal cal = (a, b) -> a + b;

        int result = cal.add(1, 2);
        System.out.println("result = " + result);

        Cal cal2 = (int a, int b) -> a + b;
    }

    interface Cal {
        int add(int a, int b);
    }
}

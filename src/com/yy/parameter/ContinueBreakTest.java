package com.yy.parameter;

/**
 * break和continue用法练习
 */
public class ContinueBreakTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5)
//                continue; // continue：使continue后面的代码不执行
                break; // break：相当于return语句，中止循环
            System.out.println("i = " + i);
        }
    }
}

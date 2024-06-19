package com.yy.array;

/**
 * @date 2024/5/14
 */
public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break; // 跳过当前循环剩下的循环
                }
                System.out.println("i =" + i + ", j =" + j);
            }
        }
    }
}

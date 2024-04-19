package com.yy.arithmetic;

/**
 * @date 2023/3/12
 */
public class Matrix {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int[][] table = new int[4][5]; // 表示一个4行5列的二维数组，相当于一个表格，表格中有数字；
        table[0][0] = 0; // 第一行
        table[0][1] = 0;
        table[0][2] = 0;
        table[0][3] = 0;
        table[0][4] = 0;

        table[1][0] = 0; // 第二行
        table[1][1] = 1;
        table[1][2] = 0;
        table[1][3] = 1;
        table[1][4] = 0;

        table[2][0] = 0; // 第3行
        table[2][1] = 1;
        table[2][2] = 0;
        table[2][3] = 0;
        table[2][4] = 1;

        table[3][0] = 0; // 第4行
        table[3][1] = 1;
        table[3][2] = 1;
        table[3][3] = 0;
        table[3][4] = 0;

        int a = table[1][0]; // A宇航员起始坐标
        int b = table[3][3]; // B宇航员起始坐标

        for (int i = 0; i < 4; i++) { // 行
            for (int j = 0; j < 5; j++) { // 列
                System.out.print("(" + i + ",");
                System.out.print(j + ")");
            }
            System.out.println();
        }

    }
}

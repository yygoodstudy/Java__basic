package com.yy.data_structure;

/**
 * 二维数组练习
 * @Date 2021/10/20 0:14
 */
public class SparseArray {
    public static void main(String[] args) {
        int[][] chessArray = new int[11][8]; // 11行8列的二维数组
        chessArray[1][2] = 1;
        chessArray[2][3] = 2;
        chessArray[0][1] = 3;

        for (int[] ints : chessArray) {
            for (int anInt : ints) {
                System.out.printf("%d\t", anInt);
            }
            System.out.println();
        }
    }
}

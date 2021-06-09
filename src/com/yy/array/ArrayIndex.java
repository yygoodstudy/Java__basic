package com.yy.array;

import java.util.Scanner;

/**
 * @Date 2021/6/1 22:16
 * 顺序查找：从左到右挨个判断数组的元素是否是你找的某个数
 */
public class ArrayIndex {
    public static void main(String[] args) {
       /* int[] numbers = {1, 90, 20, 30, 89, 55, 32, 36};
        // 从键盘输入一个数，看这个数是否在数组中，如果在，告诉我它的下标
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = scanner.nextInt();
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                System.out.println("您输入的数字为：" + number + ",它在数组中的下标为：" + i);
                index++;
            }
        }
        if (index == 0) {
            System.out.println("您输入的数字在数组中不存在~");
        }*/
        boolean nameExist = findNameExist();
        System.out.println("nameExist = " + nameExist);

    }

    /**
     * 从键盘输入五个本组学员的姓名存储在数组中，
     * 然后在输入一个姓名，看是否在数组中
     *
     * @return
     */
    public static boolean findNameExist() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String[] names = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个学员的姓名：");
            String name = scanner.next();
            if (name.equals("")) {
                System.out.println("输入的学员姓名不能为空字符串~~");
                break;
            }
        }
        System.out.println("请输入您需要查询的学员姓名：");
        String selectName = scanner.next();
        for (String username : names) {
            if (selectName.equals(username)) {
                System.out.println("您查找的学员姓名存在于数组中~~");
            } else {
                flag = false;
            }
        }
        return flag;
    }
}

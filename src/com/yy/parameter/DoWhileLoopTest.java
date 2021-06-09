package com.yy.parameter;

import java.util.Scanner;

/**
 * 随机生成100以内的数字，猜数字游戏
 * 从键盘输入数，如果大了提示大了，如果小了，提示小了，如果对了，就不用猜了
 * 并统计一共猜了多少次
 */
public class DoWhileLoopTest {
    public static void main(String[] args) {
        int flag = 52;
        boolean b = true;
        int count =0;
        Scanner scanner = new Scanner(System.in);

        while (b){
//            int random = (int)(Math.random() * 100);
            System.out.println("请输入您猜的数字0.o----");
            int number = scanner.nextInt();

            count++;
            if (number == flag){
                System.out.println("您猜对了啊，~~~");
                b= false;
            }else if (number > flag){
                System.out.println("您猜的数字大了哦~！！！"+"random="+number+",flag="+flag);
            }else{
                System.out.println("您猜的数字小了哦~！！！"+"random="+number+",flag="+flag);
            }
        }
        System.out.println("您一共猜了"+count+"次~~");
    } 
}

package com.yy.gather;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Date 2021/11/9 19:55
 */
public class TestStringApp1 {
    public static void main(String[] args) {
        // 随机0-9组成一个8位不重复数字的字符串，产生4个这样的字符串，也是互相不重复的
        Random random = new Random();
        List<String[]> strArray = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String[] genStr = new String[8];
            int first = random.nextInt(10);
            genStr[0] = String.valueOf(first);
            for (int j = 1; j < 8; j++) {
                first = Integer.parseInt(genStr[j - 1]);
                boolean flag = true;
                while (flag) {
                    int current = random.nextInt(10);
                    StringBuilder sb = new StringBuilder();
                    for (String s : genStr) {
                        if (null != s && !s.equals("")) {
                            sb.append(s);
                        }
                    }
                    if (current != first && !sb.toString().contains(String.valueOf(current))) {
                        genStr[j] = String.valueOf(current);
                        flag = false;
                    }
                }
            }
            strArray.add(genStr);
        }

        for (String[] strings : strArray) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}

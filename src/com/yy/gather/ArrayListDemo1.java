package com.yy.gather;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2021/10/16 22:07
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        List list = new ArrayList();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
    }
}

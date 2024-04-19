package com.yy.interview;

import java.util.ArrayList;

/**
 * @date 2024/4/6
 */
public class PackagingType1 {

    public static void main(String[] args) throws Exception{
        Object sum = sum(2, 1);
        System.out.println(sum);

        Integer a = 10;
        Integer b = 11;
        int i = a.compareTo(b);
        System.out.println(i);

        ArrayList objects = new ArrayList<>();
        objects.add(new Object());
        objects.add(1);
        objects.add("ssdfsf");
        for (Object object : objects) {
            System.out.println(object);
        }


    }

    public static Object sum(Object n1, Object n2){
        Integer i1 = (Integer) n1;
        Integer i2 = (Integer) n2;
        return i1 - i2;
    }
}

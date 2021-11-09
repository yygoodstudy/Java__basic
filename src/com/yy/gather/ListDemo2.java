package com.yy.gather;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Date 2021/10/16 17:43
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        names.add("f");
        names.add("g");
        names.add("h");
        names.add("i");
        names.add("j");
        names.add("k");

        System.out.println("names = " + names);
        // 在2号位插入猜不透
        names.add(1, "猜不透");
        System.out.println("names = " + names);
        // 获取第五个位置元素
        String name = names.get(4);
        System.out.println("name = " + name);
        String remove = names.remove(5);
        System.out.println("被删除的元素：" + remove);
        System.out.println("names = " + names);

        Iterator<String> it = names.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            String obj = it.next();
            System.out.println(i + " = " + obj);
        }

    }
}

package com.yy.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @date 2024/5/14
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0; i < list.size(); i++) {
            if (i == list.get(i)) {
                list.remove(i);
            }
        }

//        for (Integer num : list) { // 会报java.util.ConcurrentModificationException这个异常
//            list.remove(num);
//        }

        Queue<String> names = new LinkedBlockingDeque<>();
        names.offer("hello");
        String remove = names.remove();
        System.out.println("remove = " + remove);

    }
}

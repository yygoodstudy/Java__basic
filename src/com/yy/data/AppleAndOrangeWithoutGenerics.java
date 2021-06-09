package com.yy.data;

import java.util.*;

/**
 * @Date 2021/6/4 21:27
 */
class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange extends Apple {
}

public class AppleAndOrangeWithoutGenerics {
    public static void main(String[] args) {
//        ArrayList apples = new ArrayList();
//        for (int i = 0; i < 3; i++) {
//            apples.add(new Apple());
//        }
//        apples.add(new Orange());
//        for (int i = 0; i < apples.size(); i++) {
////            System.out.println(((Apple) apples.get(i)).id());
//            System.out.println(apples.get(i));
//        }

//        ArrayList<Apple> apples1 = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            apples1.add(new Apple());
//        }
////        apples1.add(new Orange());
//        for (Apple apple : apples1) {
//            System.out.print(apple.id() + " ");
//        }
//
//        Collection<String> c = new HashSet();
//        c.add("A");
//        c.add("B");
//        c.add("C");
//        c.add("D");
//        c.add("D");
//        System.out.println("c.size() = " + c.size());
//        System.out.println("c = " + c);

        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9};
        collection.addAll(Arrays.asList(moreInts));
        System.out.println("collection = " + collection);

        Collections.addAll(collection, 10, 11, 12);
        System.out.println("collection = " + collection);

        Collections.addAll(collection,moreInts);
        System.out.println("collection = " + collection);

        List<Integer> integers = Arrays.asList(2, 12, 3, 12, 1231);
        System.out.println("integers = " + integers);
    }
}
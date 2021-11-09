package com.yy.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Date 2021/9/12 0:28
 */
public class AppleFilter {

    interface AppleFilterInterface {
        boolean filterApple(Apple apple);
    }

    public static List<Apple> findApple(List<Apple> apples, AppleFilterInterface filterInterface) {
        List<Apple> appleList = new ArrayList<>();
        for (Apple apple : apples) {
            if (filterInterface.filterApple(apple)) {
                appleList.add(apple);
            }
        }
        return appleList;
    }

    public static class GreenAndWeightLess150 implements AppleFilterInterface {
        @Override
        public boolean filterApple(Apple apple) {
            return apple.getWeight() < 0.5 && "green".equals(apple.getColor());
        }
    }

    /**
     * 找出给定颜色的苹果
     */
    public static List<Apple> filterAppleByColor(List<Apple> apples, String color) {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (color.equals(apple.getColor()))
                greenApples.add(apple);
        }
        return greenApples;
    }

    /**
     * 按重量过滤苹果
     */
    public static List<Apple> filterAppleByWeight(List<Apple> apples) {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWeight() <= 0.50)
                greenApples.add(apple);
        }
        return greenApples;
    }


    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(new Apple("green", 0.5), new Apple("red", 0.36),
                new Apple("yellow", 0.25), new Apple("green", 0.23));
//        List<Apple> greenApples = filterAppleByColor(apples, "yellow");
//        System.out.println("greenApples = " + greenApples);
//        System.out.println("----------------");
//        List<Apple> apples1 = filterAppleByWeight(apples);
//        System.out.println("apples1 = " + apples1.size());

        List<Apple> appleList = findApple(apples, apple -> "green".equals(apple.getColor()) && apple.getWeight() < 0.5);
        System.out.println("appleList = " + appleList);

        List<Apple> appleList1 = findApple(apples, new GreenAndWeightLess150());
        System.out.println("appleList1 = " + appleList1);
    }
}

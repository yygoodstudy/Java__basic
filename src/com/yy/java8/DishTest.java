package com.yy.java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DishTest {
    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish("醋溜白菜", 100.63, true));
        dishes.add(new Dish("凉拌黄瓜", 68.01, true));
        dishes.add(new Dish("红烧排骨", 333.55, false));
        dishes.add(new Dish("糖醋里脊", 366.66, false));
        dishes.add(new Dish("爆炒牛肚", 533.69, false));
        dishes.add(new Dish("红烧肉", 623.00, false));

        List<String> collect = dishes.stream()
                .filter(d -> d.isVegetable() == false)
                .map(Dish::getName)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);

        getLowCaloricDishes(dishes);

        System.out.println(getAvgCaloricEDish(dishes));
        getAvgCaloricEDish2(dishes);
    }


    public static Map<Boolean, Double> getAvgCaloricEDish(List<Dish> dishes) {
        Map<Boolean, Double> map = new HashMap<>();
        Set<Boolean> vegetables = new HashSet<>();
        for (Dish dish : dishes) {
            vegetables.add(dish.isVegetable());
        }
        ArrayList<Boolean> booleans = new ArrayList<>(vegetables);
        for (Boolean aBoolean : booleans) {
            List<Dish> dishList = new ArrayList<>();
            for (Dish dish : dishes) {
                if (aBoolean == dish.isVegetable()) {
                    dishList.add(dish);
                }
            }
            double sumCaloric = 0.0;
            for (Dish dish : dishList) {
                sumCaloric += dish.getCaloric();
            }
            double avgCaloric = sumCaloric / dishList.size();
            map.put(aBoolean, avgCaloric);
        }
        return map;
    }

    public static void getAvgCaloricEDish2(List<Dish> dishes) {
        dishes.stream()
                .collect(Collectors.groupingBy(d -> d.isVegetable(), Collectors.averagingDouble(c -> c.getCaloric())))
                .forEach((k, v) -> System.out.println(k + ":" + v));
//        System.out.println("collect = " + collect);
    }

    /**
     * java7 实现从所有菜品中选出热量低于400的菜品并按热量从小到大排序的菜品名
     *
     * @param dishes：菜肴
     */
    private static void getLowCaloricDishes(List<Dish> dishes) {

        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish dish : dishes) {
            if (dish.getCaloric() < 400) {
                lowCaloricDishes.add(dish);
            }
        }

        Collections.sort(lowCaloricDishes, Comparator.comparingDouble(Dish::getCaloric));

        List<String> lowCaloricDishesName = new ArrayList<>();
        for (Dish dish : lowCaloricDishes) {
            lowCaloricDishesName.add(dish.getName());
        }

        System.out.println(lowCaloricDishesName);
        System.out.println("--------------------");
        getLowCaloricDishesJava8(dishes);
        System.out.println("------------------------");
        test01(dishes, d -> d.getCaloric() > 100 && d.isVegetable() == true);
    }

    /**
     * Stream流实现
     *
     * @param dishes
     */
    public static void getLowCaloricDishesJava8(List<Dish> dishes) {
        List<String> dishNameList = dishes.stream()
                .filter(d -> d.getCaloric() < 400)
                .sorted(Comparator.comparingDouble(Dish::getCaloric))
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println(dishNameList);
    }


    public static void test01(List<Dish> dishes, Predicate<? super Dish> pre) {
        List<Dish> collect = dishes.stream()
                .filter(pre)
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}

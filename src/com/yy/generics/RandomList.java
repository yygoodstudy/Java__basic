package com.yy.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Date 2021/6/9 20:36
 */
public class RandomList<T> {
    private List<T> storate = new ArrayList<>();
    //    private Random random = new Random(47); // 每次随机生成的数字是一样的
    private Random random = new Random();

    public void add(T item) {
        storate.add(item);
    }

    public T select() {
        int size = storate.size();
        System.out.println("size = " + size);
        int i = random.nextInt(size);
        System.out.println("i = " + i);
        return storate.get(i);
    }

    public static void main(String[] args) {
        RandomList<String> randomList = new RandomList<>();
        String[] strings = "刚上厕所没纸了，突然刷到这首歌，就觉得人生没有什么过不去的坎，不擦了，怀着自信走了出去，从来都没有这么自信过，谢谢你！ 加油".split("，");
        for (String s : strings) {
            randomList.add(s);
        }
        String select = randomList.select();
        System.out.println("select = " + select);
    }

}

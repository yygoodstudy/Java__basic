package com.yy.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Date 2021/8/29 18:03
 */
public class SingleTon {
    private static final SingleTon singtle = new SingleTon();
    private static List<String> list = new ArrayList<>();

    // 观察者，单例，适配器
    public static void main(String[] args) {
        Arrays.asList("String", "String", "a");
    }

}

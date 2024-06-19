package com.yy.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @date 2024/4/17
 */
public class HashTableDemo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("语文", "90");
        map.put("数学", "80");
        map.put("英语", "70");
        map.put("物理", "89");

        // 1. 通过Map的entrySet方法遍历
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("--------------------");

        // 2. 通过Map的keySet方法获取所有的key，然后在对keySet进行遍历，通过Map.get(key)获取key对应的值
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }

        System.out.println("--------------------");

        // 3.通过lambda表达式遍历
        map.forEach((k, v) -> System.out.println(k + ":" + v));


        String number = map.getOrDefault("地理", "90");
        System.out.println("number = " + number);
        System.out.println(map);

    }
}

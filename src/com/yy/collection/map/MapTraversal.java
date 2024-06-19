package com.yy.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @date 2022/5/16
 */
public class MapTraversal {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("邓超", "book");
        map.put("王荣", "abc");
        map.put("张洁", "hesdfs");
        map.put("姚远", "2342");
        map.put("1333", "hello");
        map.put(null, null);
        map.put(null, "张三");
        map.put("abc", null);
        // Map遍历的几种方式：
        // 1.通过keySet()方法获取所有key的集合，再遍历key集合，通过map.get(key)方法获取key对应键的值；增强for循环
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(value);
        }
        System.out.println("----------------------------------");

        // 2.通过EntrySet遍历
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("----------------------------------");

        // 3.通过EntrySet的迭代器遍历
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("----------------------------------");

        // 4.通过KeySet的迭代器遍历
        Iterator<String> keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            System.out.println(key + ":" + map.get(key));
        }

        // 通过遍历entrySet删除map集合中的元素时会报错
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            if ("王荣".equals(entry.getKey())) {
//                map.remove("王荣");
//                continue;
//            }
//        }

        // 正确的动态删除map集合中的元素
        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            if ("王荣".equals(entryIterator.next().getKey())) {
                entryIterator.remove();
                continue;
            }
        }
    }
}

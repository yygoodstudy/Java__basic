package com.yy.gather;

import java.util.*;

/**
 * @Date 2021/10/14 21:15
 */
public class ListDemo1 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5};
        List list = new ArrayList();
        list.add("hello World");
        list.add('A');
        list.add(10);
        list.add(false);
        list.add(true);
        list.add(null);
        list.add(null);
        System.out.println("list = " + list);
        boolean remove = list.remove(true); // 1.List如果删除的是Object，方法返回的是Boolean值,表示是否删除成功
        System.out.println("remove = " + remove);
        System.out.println("list = " + list);
        Object remove1 = list.remove(1);
        System.out.println("remove1 = " + remove1); // 2.List如果通过索引删除，返回的就是被删除的元素
        System.out.println("list = " + list);

        boolean hello_world = list.contains("hello World");
        System.out.println("list.contains(true) = " + list.contains(true)); // list.contains(Object o):是否包含某个元素
        System.out.println("hello_world = " + hello_world);
        System.out.println("list.size() = " + list.size());
        System.out.println("numbers.length = " + numbers.length);

        System.out.println("list.isEmpty() = " + list.isEmpty()); // list.isEmpty()判断集合是否为空

        list.set(0, "yaoyuan"); // set(index,Object):设置index位置的元素为Object

        Set<String> bookNames = new HashSet<>();
        bookNames.add("红楼梦");
        bookNames.add("西游记");
        bookNames.add("三国演义");
        bookNames.add("水浒传");
        System.out.println("list = " + list);

        boolean b = list.addAll(bookNames);
        System.out.println("b = " + b);
        System.out.println("list = " + list);

        List<Object> newList = new ArrayList<>();
        newList.add(null);
        newList.add(null);
        boolean b1 = list.removeAll(newList);
        System.out.println("b1 = " + b1);
        System.out.println("list = " + list);

        Map<Object, Object> map = Collections.emptyMap();
//        map.put("尹昔眠", "江上晚风游");
        System.out.println("map = " + map);

        Map emptyMap = Collections.EMPTY_MAP;
        emptyMap.put("1", "hello");
    }
}

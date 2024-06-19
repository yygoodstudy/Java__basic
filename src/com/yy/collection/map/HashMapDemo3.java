package com.yy.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @date 2024/4/16
 */
public class HashMapDemo3 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();

        hm.put("a", "zhang jie");
        hm.put(null, "231");
        hm.put("b", "yao yuan");
        hm.put("c", "zhang jie");
        hm.put("AaAa", "爱能让彼此坚定");
        hm.put("BBBB", "天下");

        System.out.println(hm);

//        int hashed1 = hash("AaAa");
//        int hashed2 = hash("BBBB");
//        System.out.println("hashed1 = " + hashed1);
//        System.out.println("hashed2 = " + hashed2);

        Person person = new Person();
        HashMapDemo3 demo3 = new HashMapDemo3();
        demo3.add(1, person);
        demo3.add(2, person);
        demo3.add(3, person);
        List<Object> objects = person.getObjects();
        List<Object> list = demo3.getList(person);
        System.out.println("list = " + list);
    }


    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    static class Person {
        List<Object> objects = new ArrayList<>();

        public List<Object> getObjects() {
            return objects;
        }
    }

    public void add(Object obj, Person person) {
        person.getObjects().add(obj);
    }

    List<Object> getList(Person person) {
        return person.objects;
    }
}

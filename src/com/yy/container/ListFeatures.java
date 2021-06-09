package com.yy.container;

import java.util.*;

/**
 * @Date 2021/6/6 14:47
 */
class Pet {
    Integer id;
    String name;

    Pet(String name) {
        this.name = name;
    }

    Pet(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public Integer id() {
        return id;
    }

    @Override
    public String toString() {
        return "(id=" + id + ",name=" + name+" )";
    }
}

public class ListFeatures {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        Pet dog = new Pet("狗子");
        Pet cat = new Pet("猫咪");
        Pet pig1 = new Pet("猪1");
        Pet pig2 = new Pet("猪2");
        Pet pig3 = new Pet("猪3");
        Pet pig4 = new Pet("猪4");
        pets.add(dog);
        pets.add(cat);
        pets.add(pig1);
        pets.add(pig2);
        pets.add(pig3);
        pets.add(pig4);
        System.out.println(pets);
        System.out.println("pets.contains(cat) = " + pets.contains(cat));
        int i = pets.indexOf(pig3);
        System.out.println("i = " + i);
        boolean removePig3 = pets.remove(pig3);
        System.out.println("removePig3 = " + removePig3);
        System.out.println(pets);
        int j = pets.indexOf(pig3);
        System.out.println("j = " + j);
        List<Pet> pets1 = pets.subList(0, 3);
        System.out.println(pets1);

        Map<Object, Object> map = Collections.emptyMap();
        Map<Object, Object> newMap = new HashMap<>(map);
        newMap.put("name", "sdf");
        System.out.println("newMap = " + newMap);

        Iterator<Pet> it = pets.iterator();
        while (it.hasNext()) {
            Pet next = it.next();
            System.out.println("next = " + next);
        }
    }
}

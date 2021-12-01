package com.yy.generics;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @date 2021/11/25
 */
public class Person {
    public static void main(String[] args) {
        print(new ArrayList<>());
    }

    public static void print(Collection<? super Person> coll){
        coll.add(new Person());
        coll.add(new Teacher());
        coll.add(new EnglishTeacher());
        System.out.println("coll = " + coll);
    }
}

class Teacher extends Person {
}

class EnglishTeacher extends Teacher {
}
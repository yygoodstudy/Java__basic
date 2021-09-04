package com.yy.hashcode;

/**
 * @Date 2021/8/26 20:55
 */
public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student(1, "姚远");
        Student s2 = new Student(2, "姚远");
        System.out.println(s1.equals(s2));
    }
}

package com.yy.extend.extend_;

/**
 * @date 2024/5/14
 */
public class People {

    public String name = "yaoyuan";
    private Integer age = 31;

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public People() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void showInfo(String name, int age) {
        System.out.println(name + ":" + age);
    }

    public void showInfo() {
    }

    public void showInfo(int age, String name) {
    }

    public void showInfo(String name, String address) {
    }


    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.yy.extend;

/**
 * @Date 2021/5/25 22:06
 */
public class Father {

    private String name;
    private Integer age;
    private Double property; // 财产

    public Father(String name, Integer age, Double property) {
        this.name = name;
        this.age = age;
        this.property = property;
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

    public Double getProperty() {
        return property;
    }

    public void setProperty(Double property) {
        this.property = property;
    }



    public void eat(){
        System.out.println("爸爸爱吃米饭炒菜~~");
    }
}

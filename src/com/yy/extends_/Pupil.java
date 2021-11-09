package com.yy.extends_;

/**
 * 小学生
 * @Date 2021/9/13 20:22
 */
public class Pupil {

    private String name;
    private Integer age;
    private double score;

    public Pupil() {
    }

    public Pupil(String name, Integer age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public void setScore(double score) {
        this.score = score;
    }

   public void testing(){
       System.out.println("小学生"+name+"正在考小学数学");
   }

   public void showInfo(){
       System.out.println("学生名:"+name+"age:"+age+"成绩:"+score);
   }

}

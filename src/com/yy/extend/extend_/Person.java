package com.yy.extend.extend_;

/**
 * @Date 2021/11/9 17:38
 */
public class Person {
    private String name;
    private Integer age;

    public Person() {
        System.out.println("Person...无参构造方法执行了..."); // 4
    }

    {
        System.out.println("Person--》》》》实例代码块"); // 3
    }

    static {
        System.out.println("Person--》》》》静态代码块"); // 1
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

    public Integer getX(){
        return this.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Teacher extends Person {

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher() {
        System.out.println("Teacher类....无参构造方法执行了...."); // 6
    }

    {
        System.out.println("Teacher--》》》》实例代码块"); // 5
    }

    static {
        System.out.println("Teacher--》》》》静态代码块"); // 2
    }



    public static void main(String[] args) {
//        Person pt = new Teacher();
//        pt.setAge(12);
//        pt.setName("痴情冢");

        Teacher teacher = new Teacher();

    }
}
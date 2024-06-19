package com.yy.extend.extend_;

/**
 * @date 2024/5/14
 */
public class Teachr extends People{

    public Teachr(String name, Integer age) {
        super(name, age);
    }

    public Teachr(){
        super();
    }

    public String getNameAndAge(){
        return "hello world";
    }
}
class CCC {
    public static void main(String[] args) {
        People teachr = new Teachr();

        System.out.println(teachr.getName());
        System.out.println(teachr.getAge());

        Integer a = new Integer(2);
        Integer b = 2;

        boolean b1 = a == b;
        System.out.println("b1 = " + b1);
    }
}
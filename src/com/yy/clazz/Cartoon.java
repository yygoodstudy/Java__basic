package com.yy.clazz;

/**
 * @Date 2021/6/5 14:30
 */
class Art{
    Art(){
        System.out.println("Art constructor");
    }
}
class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing Constructor");
    }
}
public class Cartoon extends Drawing{
    Cartoon(){
        System.out.println("Cartoon Constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}

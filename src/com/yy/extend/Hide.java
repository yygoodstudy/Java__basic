package com.yy.extend;

/**
 * @Date 2021/6/5 14:52
 */
class Homer{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("doh(float)");
        return 1.0f;
    }
}
class MilHouse{}
class Bart extends Homer{
    void doh(MilHouse milHouse){
        System.out.println("doh(MilHouse)");
    }
}
public class Hide {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(new MilHouse());
    }
}

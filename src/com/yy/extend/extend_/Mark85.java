package com.yy.extend.extend_;

/**
 * @Date 2021/11/9 18:30
 */
public class Mark85 extends Mark1{
    private void createShield(){
        System.out.println("利用纳米技术生成防御护盾");
    }

    public static void main(String[] args) {
        Mark85 mark85 = new Mark85();
        mark85.title = "马克85号战甲";
        mark85.color = "RED";
        mark85.movie = "复仇者联盟5";

        mark85.description();
        mark85.createShield();
    }
}

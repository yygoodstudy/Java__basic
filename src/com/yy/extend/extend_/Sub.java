package com.yy.extend.extend_;

/**
 * @Date 2021/11/9 17:00
 * 子类继承了父类中的所有方法和属性；但是私有的属性和方法不能够直接访问；需要间接访问(父类提供公有的方法进行访问)；
 */
public class Sub extends Base {

    public Sub() {
        System.out.println("Sub()...");
    }

    public void sayOk() {
        System.out.println("super.n1 = " + super.n1);
        System.out.println("super.n2 = " + super.n2);
        System.out.println("super.n3 = " + super.n3);

        System.out.println(n1 + n2 + n3 + findN4());
        test100();
        test200();
        test300();
        int n4 = findN4();
        System.out.println("n4 = " + n4);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.sayOk();
    }
}

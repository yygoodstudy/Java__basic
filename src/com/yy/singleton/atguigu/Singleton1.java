package com.yy.singleton.atguigu;

/**
 * 饿汉式
 *  饿汉式就是不管你需不需要这个单例的实例对象我都直接给你创建好，你需要的时候直接拿去用
 * 1. 构造器私有化
 * 2. 自行创建该类的实例并保存到一个静态的常量身上
 * 3. 对外提供一个方法暴露这个静态的常量
 * @date 2024/4/6
 */
public class Singleton1 {

    public static final Singleton1 SINGLETON_1 = new Singleton1();
    private Singleton1(){}
}

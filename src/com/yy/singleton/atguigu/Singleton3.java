package com.yy.singleton.atguigu;

import java.io.IOException;
import java.util.Properties;

/**
 * 饿汉式的第三种写法：用于复杂的情况，例如需要读取配置文件里的内容
 * 1. 声明SINGLETON_3这个静态的常量
 * 2. 构造器私有化
 * 3. 通过静态代码块的方式，初始化SINGLETON_3这个常量
 * 4. 前三种都是在类初始化的时候直接创建对象，不管你是否需要这个对象
 *
 * @date 2024/4/6
 */
public class Singleton3 {

    public static final Singleton3 SINGLETON_3;
    private String info;

    static {
        Properties properties = new Properties();
        try {
            properties.load(Singleton3.class.getClassLoader().getResourceAsStream("test.properties"));
            SINGLETON_3 = new Singleton3(properties.getProperty("haha"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Singleton3(String info) {
        this.info = info;
    }

    public static Singleton3 getSingleton3() {
        return SINGLETON_3;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Singleton3{" +
                "info='" + info + '\'' +
                '}';
    }
}

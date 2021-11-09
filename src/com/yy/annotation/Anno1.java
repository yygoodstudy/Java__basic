package com.yy.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解
 *
 * @Date 2021/9/25 20:01
 */
@Target({ElementType.TYPE, ElementType.METHOD}) // 标明该注解的作用范围
@Retention(RetentionPolicy.RUNTIME) // RetentionPolicy.RUNTIME:在运行时有效；RetentionPolicy.CLASS:只在程序编译阶段起作用;
// RetentionPolicy.SOURCE:在原文件中有效，被编译时丢弃
@Documented // 标注了此注解的注解会被保留在Javadoc文档中
@Inherited // 表示该注解是否在子类中继承
public @interface Anno1 {
    int age();

    boolean flag();

    double salary();

    char chr();

    Class clazz();

    String name();

    Season SEASON();

    Class[] classes();

    String address() default "陕西省商洛市商南县金丝峡镇兴隆村石门组";
}

package com.yy.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Date 2021/9/25 20:19
 */
@Anno1(age = 12, flag = false, salary = 10000.00, chr = 'A', clazz = Season.class, name = "zhangSan",
        SEASON = Season.AUTUMN, classes = Anno1.class)
public class AnnoTest {

    private String address;

    @Anno1(age = 12, flag = false, salary = 10000.00, chr = 'A', clazz = Season.class, name = "zhangSan",
            SEASON = Season.AUTUMN, classes = Anno1.class, address = "")
    public void show(String address) {
        this.address = address;
        System.out.println("this is AnnoTest method show(String address): address = " + address);
    }

    // 通过Java反射获取自定义注解中的属性值，并且通过反射调用方法
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<AnnoTest> aClass = AnnoTest.class;
        Annotation[] annotations = aClass.getAnnotations();

        AnnoTest annoTest = new AnnoTest();
        for (Annotation annotation : annotations) {
            if (annotation.annotationType() == Anno1.class) {
                Anno1 annotation1 = aClass.getAnnotation(Anno1.class);
                Method[] methods = aClass.getMethods();
                for (Method method : methods) {
                    if (method.getName().equals("show")) {
                        method.invoke(annoTest, annotation1.address());
                    }
                }
            }
        }
    }
}

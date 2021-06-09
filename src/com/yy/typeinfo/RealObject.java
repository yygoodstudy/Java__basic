package com.yy.typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Date 2021/6/6 19:45
 * 代理模式
 */
interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

public class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("do something...");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("something else " + arg);
    }
}

class SimpleProxy implements Interface {

    private Interface anInterface;

    SimpleProxy(Interface anInterface) {
        this.anInterface = anInterface;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy do something");
        anInterface.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse");
        anInterface.somethingElse("bonono");
    }
}

class SimpleProxyDemo {
    static void consumer(Interface inf) {
        inf.doSomething();
        inf.somethingElse("输赢");
    }

    public static void main(String[] args) {
//        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied; // 被代理对象

    DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    /**
     * @param proxy  被代理对象
     * @param method 目标方法
     * @param args   方法参数
     * @return 代理对象
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("***** proxy: " + proxy.getClass() + ".method: " + method + ", args: " + args);
        StringBuffer sb = new StringBuffer();

        if (args != null) {
            for (Object arg : args) {
                System.out.println(" " + arg);
                sb.append(arg.toString());
            }
        }
        logBefore(sb.toString());
        Object invoke = method.invoke(proxied, args);
        logAfter(sb.toString());
        return invoke;
    }

    public void logBefore(String args) {
        System.out.println(args);
    }

    public void logAfter(String args) {
        System.out.println(args);
    }
}

class SimpleDynamicProxy {
    static void consumer(Interface inf) {
        inf.doSomething();
        inf.somethingElse("aaaa");
    }

    public static void main(String[] args) {
        RealObject realObject = new RealObject();
//        consumer(realObject);
        System.out.println("------------------");
        Interface inf = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
                new Class[]{Interface.class}, new DynamicProxyHandler(realObject)); // 创建

        consumer(inf);
    }
}
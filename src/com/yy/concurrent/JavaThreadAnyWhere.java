package com.yy.concurrent;

/**
 * java的main方法其实是被JVM里的一个名叫main的线程执行的
 *
 * @date 2024/4/17
 */
public class JavaThreadAnyWhere {

    public static void main(String[] args) {
        System.out.println("main方法被 " + Thread.currentThread().getName() + " 线程调用");
        Helper helper = new Helper("java的线程无处不在");
        helper.run();
        new Thread(helper).start();
        new Thread(helper).start();
    }

    static class Helper implements Runnable {
        private final String message;

        public Helper(String message) {
            this.message = message;
        }

        private void doSomething(String message) {
            Thread thread = Thread.currentThread(); // 获取当前线程
            String name = thread.getName(); // 获取当前线程名称

            System.out.println("doSomething 方法被 " + name + " 线程调用");
            System.out.println("doSomething with " + message);
        }

        @Override
        public void run() {
            doSomething(message);
        }
    }
}

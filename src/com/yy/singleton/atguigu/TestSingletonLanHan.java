package com.yy.singleton.atguigu;

import java.util.concurrent.*;

/**
 * @date 2024/4/6
 */
public class TestSingletonLanHan {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

      /*  Set<Singleton4> singleton4s = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Singleton4 singleton4 = Singleton4.getSingleton4();
                singleton4s.add(singleton4);
            }).start();
        }
        int size = singleton4s.size();
        System.out.println("size = " + size);*/

        Callable<Singleton4> singleton4Callable = new Callable<Singleton4>() {
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getSingleton4();
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Singleton4> future1 = executorService.submit(singleton4Callable);
        Future<Singleton4> future2 = executorService.submit(singleton4Callable);
        Singleton4 singleton4 = future1.get();
        Singleton4 singleton41 = future2.get();
        System.out.println("singleton41 = " + singleton41);
        System.out.println("singleton4 = " + singleton4);
        System.out.println(singleton41 == singleton4);

        executorService.shutdown();
    }
}

//package com.yy.array;
//
//import java.util.Queue;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
///**
// * @date 2021/12/1
// * @author YaoDing
// */
//@Component
//public class Handler implements ApplicationRunner{
//
//    void init() throws InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 10; i++) {
//            executorService.submit(new B());
//        }
//
//    }
//}
//class B implements Runnable{
//
//    @Override
//    public void run() {
//        while(true) {
//            try {
//                Thread.sleep(1L);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
////            Object remove = ThreadTest.queue.remove();
//            //TODO
//        }
//    }
//}

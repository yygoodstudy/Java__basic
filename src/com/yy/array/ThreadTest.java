package com.yy.array;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @date 2021/12/1
 * @author YaoDing
 */
public class ThreadTest implements Runnable {
    public final Object lock = new Object();
    public Queue queue = new LinkedBlockingQueue(1024);

    @Override
    public void run() {
        try {
            if (Thread.currentThread().getName().equals("Thread-1")) {
                skip();
            } else {
                synchronized (lock) {
                    System.out.println("lock start");
                    Thread.sleep(5000L);
                    System.out.println("lock end");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static synchronized void skip() throws InterruptedException {
        System.out.println("skip start");
        Thread.sleep(5000L);
        System.out.println("skip end");
    }

    public static void main(String[] args) {
        ThreadTest threadTest0 = new ThreadTest();
        ThreadTest threadTest1 = new ThreadTest();
        new Thread(threadTest0).start();
        new Thread(threadTest1).start();
    }

//    @KafkaLister("topic")
//    public void consumer(List<Disposer.Record> records) {
//        for (int i = 0; i < records.size(); i++) {
//            queue.add(records[i]);
//        }
//    }
}

package com.yy.concurrent;

/**
 * @date 2022/5/5
 */
public class TestRunAndStart {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000); // 使当前线程休眠多长时间(在未来的1000毫秒内我不想再参与到CPU竞争)，不会释放锁
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();

        System.out.println("state = " + t1.getState()); // 获取当前线程的运行状态

        Thread.sleep(1000);
        System.out.println("state = " + t1.getState());
        t1.interrupt();
    }
}

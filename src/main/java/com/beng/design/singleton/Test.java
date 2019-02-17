package com.beng.design.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试创建单例模式 效率
 * 
 * @author apple
 */
public class Test {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();
        int nthreads = 10;
        final CountDownLatch count = new CountDownLatch(nthreads);

        for (int j = 0; j < nthreads; ++j) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000000; ++i) {
                        Object obj = SingletonEnum.INSTANCE;
                    }
                    count.countDown();
                }
            }).start();
        }

        long end = System.currentTimeMillis();
        count.await(); // main 线程阻塞，直到count=0
        System.out.println("总耗时：" + (end - start));

    }
}

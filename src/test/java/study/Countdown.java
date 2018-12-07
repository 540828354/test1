package study;

import java.util.concurrent.CountDownLatch;

public class CountDown {

    public static void main(String[] args) {
        int count = 10;
        final CountDownLatch l = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            final int index = i;
            new Thread(() -> {
                try {
                    Thread.currentThread().sleep(5*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread " + index + " has finished...");
                l.countDown();
            }).start();
//            new Thread(new Runnable() {
//
//                @Override
//                public void run() {
//                    try {
//                        Thread.currentThread().sleep(5*1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("Thread " + index + " has finished...");
//                    l.countDown();
//                }
//            }).start();
        }

        try {
            l.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("all threads have finished.");
    }

}

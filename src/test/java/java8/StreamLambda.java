package java8;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/4/27.
 */
public class StreamLambda {
    public static void main(String[] args) {
//        System.out.println("主线程ID：" + Thread.currentThread().getId());
//        Thread thread = new Thread(() -> {
//            System.out.print("abc");
//            System.out.println("def");
//        });
//        thread.start();


        Executor executor = Executors.newFixedThreadPool(10);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("task over");
            }
        };
//        Runnable task2 = () -> System.out.println("task over"); 可以这么写
        executor.execute(task);

        executor = Executors.newScheduledThreadPool(10);
        ScheduledExecutorService scheduler = (ScheduledExecutorService) executor;
        scheduler.scheduleAtFixedRate(task, 10, 10, TimeUnit.SECONDS);
    }
}

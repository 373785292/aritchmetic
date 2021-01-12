package 线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: hbh
 * @time: 2021/1/6 17:10
 */
// 定义一个定长线程， 会复用线程
public class ThreadPoolExcutorTest03 {
    public static void main(String[] args) {
        // 定义了一个3个线程
        ExecutorService fixedThreadPool= Executors.newFixedThreadPool(3);
        for (int i = 0; i <10 ; i++) {
            fixedThreadPool.execute(()->{
                System.out.println(Thread.currentThread().getName()+"正在执行任务");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        fixedThreadPool.shutdown();
    }
}

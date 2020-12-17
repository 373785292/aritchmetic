package 多线程.executeservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/17 9:58
 */

public class ExecuteServiceTest01 {
    public static void main(String[] args) {
        ExecutorService e= Executors.newFixedThreadPool(8);
        for (int i = 0; i <10 ; i++) {
            final int index=i;
            e.execute(()->{
                try {
                    System.out.println(index);
                    Thread.sleep(2000);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            });
        }
        e.shutdown();
    }
}

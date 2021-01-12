package 多线程.中断;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/20 14:38
 */
// 测试中断标志
public class InterruptTest01 {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(()->{
            System.out.println("线程一正在执行，将进入等待状态，当前时间="+System.currentTimeMillis()+"此时中断标志为"+Thread.currentThread().isInterrupted());
            LockSupport.park();
            System.out.println("线程一从等待状态中醒来，当前时间="+System.currentTimeMillis()+"此时中断标志为"+Thread.currentThread().isInterrupted());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程一从等待状态中醒来，当前时间="+System.currentTimeMillis()+"此时中断标志为"+Thread.currentThread().isInterrupted());
        });
        System.out.println("主线程正在执行");
        t.start();
        System.out.println("主线程等待，睡眠2秒");
        TimeUnit.SECONDS.sleep(2);
        t.interrupt();
    }
}

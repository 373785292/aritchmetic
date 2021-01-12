package 多线程.中断;

import java.util.concurrent.locks.LockSupport;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/22 20:41
 */

public class LockTest03 {
    public static void main(String[] args) {
        test01();
    }

    public static void test01(){
        Thread t1=new Thread(()->{
            System.out.println("park");
            LockSupport.park();
            System.out.println("unpark");
            System.out.println("打断状态为"+Thread.currentThread().isInterrupted());
            //LockSupport.park();
            //System.out.println("打断状态为"+Thread.currentThread().isInterrupted());
            //System.out.println("unpark");
        });
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         t1.interrupt();
    }
}

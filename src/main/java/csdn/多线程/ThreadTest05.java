package csdn.多线程;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: hbh
 * @time: 2021/1/2 15:11
 */

// 死锁问题
public class ThreadTest05 {
    private static Object lockA=new Object();
    private static Object lockB=new Object();
    private static void threadA(){
        new Thread(()->{
            synchronized (lockA){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockB){

                }
            }
        }).start();
    }
    private static void threadB(){
        new Thread(()->{
            synchronized (lockA){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockB){

                }
            }

        }).start();
    }

    public static void main(String[] args) {
        threadA();
        threadB();
    }
}

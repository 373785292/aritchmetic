package 多线程.lock8;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/13 16:19
 */

public class SynLock03 {
    public static void main(String[] args) {
        Phone3 p=new Phone3();
        Phone3 p1=new Phone3();
        new Thread(()->p.SendSms(),"A").start();

        new Thread(()->p1.call(),"B").start();
    }
}

class Phone3{
    // 静态  类加载 锁的是class 类模板
    public static synchronized  void call(){
        System.out.println("我会打电话");
    }

    public synchronized void SendSms(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我会发短信");
    }
}

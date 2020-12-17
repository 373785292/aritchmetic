package 多线程.lock8;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/13 16:19
 */

public class SynLock01 {
    public static void main(String[] args) {
        Phone p=new Phone();
        new Thread(()->p.SendSms(),"A").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->p.call(),"B").start();
    }
}

class Phone{
    // synchronized 锁的是方法的调用者，谁先调用，谁先执行
    public synchronized  void call(){
        System.out.println("我会打电话");
    }

    public synchronized void SendSms(){
        System.out.println("我会发短信");
    }
}

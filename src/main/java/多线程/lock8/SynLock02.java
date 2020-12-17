package 多线程.lock8;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/13 16:19
 */

public class SynLock02 {
    public static void main(String[] args) {
        Phone1 p=new Phone1();
        Phone1 p1=new Phone1();
        //new Thread(()->p.SendSms(),"A").start();
        new Thread(()->p.call(),"B").start();
        new Thread(()->p1.sayHello(),"C").start();
    }
}

class Phone1{
    // synchronized 锁的是方法的调用者，谁先调用，谁先执行
    public synchronized  void call(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我会打电话");
    }

    public synchronized void SendSms(){
        System.out.println("我会发短信");
    }
    // 普通方法不受锁的控制
    public void sayHello(){
        System.out.println("hello");
    }
}

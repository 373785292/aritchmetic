package 多线程;

import lombok.Synchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/10 23:26
 *  生产者和消费者的问题
 */

public class LockTest02 {
    //static Lock lock=new ReentrantLock();

    public static void main(String[] args) {
        Data d=new Data();
        new Thread(()->{
            try {
                for(int i=0;i<40;i++)
                    d.increase();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();

        new Thread(()->{
            try {
                for(int i=0;i<40;i++)
                d.decrease();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"B").start();

        new Thread(()->{
            try {
                for(int i=0;i<40;i++)
                d.increase();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"C").start();

        new Thread(()->{
            try {
                for(int i=0;i<40;i++)
                    d.decrease();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"D").start();
    }




}
 class Data{
    private int number=0;
    public synchronized void increase() throws InterruptedException {
        if(number!=0){
            // 等待
            this.wait();
        }
        // 加1
        number++;
        System.out.println(Thread.currentThread().getName()+"  "+number);
        this.notifyAll();

    }

    public synchronized void  decrease() throws InterruptedException {
        if(number==0){
            // 等待
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName()+"  "+number);
        this.notifyAll(); //通知其他线程
    }
}
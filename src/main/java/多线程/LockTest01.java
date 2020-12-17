package 多线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/10 19:36
 * Lock
 */

public class LockTest01 {
    private Integer ticket;
    Lock lock=new ReentrantLock();
    public LockTest01(Integer ticket){
        this.ticket=ticket;
    }
    public  void sale(){
        try{
            lock.lock(); // 锁住
                if(ticket>0){
                    System.out.println("当前"+Thread.currentThread().getName()+"卖出了一张票,剩余："+ticket--);
                }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock(); // 解锁
        }
    }


    public static void main(String[] args) {
        LockTest01 lt=new LockTest01(100);
        new Thread(()-> {for(int i = 0; i <40 ; i++) lt.sale();}).start();
        new Thread(()-> {for(int i = 0; i <40 ; i++) lt.sale();}).start();
        new Thread(()-> {for(int i = 0; i <40 ; i++) lt.sale();}).start();
        new Thread(()-> {for(int i = 0; i <40 ; i++) lt.sale();}).start();
    }
}

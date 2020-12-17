package 多线程.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/13 14:51
 */

public class ConditionTest01 {
    private Lock l=new ReentrantLock();
    // 实现精准通知唤醒 监视
    private Condition condition01 = l.newCondition();
    private Condition condition02 = l.newCondition();
    private Condition condition03 = l.newCondition();

    public static void main(String[] args) {
        ConditionTest01 ct=new ConditionTest01();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    ct.condition01();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"A").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    ct.condition02();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"B").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    ct.condition03();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"C").start();
    }
    private int number=1;
    public void condition01() {
        try{
            l.lock();
            while(number!=1){
                condition01.await();
            }
            number=2;
            System.out.println(Thread.currentThread().getName()+"  "+number);
            // 唤醒
            condition02.signal();
        }catch (Exception e){

        }finally {
            l.unlock();
        }
    }
    public void condition02()  {
        try{
            l.lock();
            while(number!=2){
                condition02.await();
            }
            number=3;
            System.out.println(Thread.currentThread().getName()+"  "+number);
            // 唤醒
            condition03.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            l.unlock();

        }
    }
    public void condition03() {
        try{
            l.lock();
            while(number!=3){
                condition03.await();
            }
            number=1;
            System.out.println(Thread.currentThread().getName()+"  "+number);
            // 唤醒
            condition01.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            l.unlock();
        }
    }
}

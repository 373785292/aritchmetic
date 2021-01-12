package csdn.多线程;

import lombok.SneakyThrows;

import javax.swing.plaf.TableHeaderUI;

/**
 * @description:
 * @author: hbh
 * @time: 2021/1/1 20:23
 */

public class ThreadTest03 extends Thread{
    private int number=10;
    @SneakyThrows
    @Override
    public void run() {
        getThreadClass();
        synchronized (ThreadTest03.class){
            for(int i=10;i>0;i--){
                if(number>0){
                    System.out.println(Thread.currentThread().getName()+"  "+--number);
                }
            }
        }
    }

    public  void getThreadClass() throws InterruptedException {
        synchronized (this){
            System.out.println(Thread.currentThread().getName()+" "+this.getState());
            Thread.sleep(1000);
            for(int i=0;i<5;i++){
                System.out.println(this.getName());
            }
        }
    }
    public static void main(String[] args) {
        ThreadTest03 t1=new ThreadTest03();
        ThreadTest03 t2=new ThreadTest03();
        t1.start();
        System.out.println("t1启动");
        t2.start();
        System.out.println("t2启动");
    }
}

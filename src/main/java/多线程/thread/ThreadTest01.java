package 多线程.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/16 22:26
 */

public class ThreadTest01 {
    private static int shared=0;
    private static void incrShared(){
        shared++;
    }
    static class ChildThread extends Thread{
        List<String> list;
        public ChildThread(List<String> list){
            this.list=list;
        }

        @Override
        public void run() {
            incrShared();
            list.add(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) throws InterruptedException {
        List<String> list=new ArrayList<>();
        Thread t1=new ChildThread(list);
        Thread t2=new ChildThread(list);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(shared);
        System.out.println(list);
    }
}



package csdn.多线程;

/**
 * @description:
 * @author: hbh
 * @time: 2021/1/1 18:39
 */

public class ThreadTest02 extends Thread {
    private static int number=0;
    @Override
    public void run() {
        synchronized (""){
            for(int i=0;i<1000;i++){
                //System.out.println(Thread.currentThread().getName()+"  "+number++);
                number++;
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        int num=1000;
        Thread[] t=new Thread[num];
        for (int i = 0; i <num ; i++) {
            t[i]=new ThreadTest02();
            t[i].start();
        }
        Thread.sleep(1000);
        System.out.println(number);
    }
}

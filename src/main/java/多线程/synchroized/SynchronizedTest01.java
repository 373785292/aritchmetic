package 多线程.synchroized;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/30 22:26
 */

public class SynchronizedTest01 extends Thread {
    private volatile boolean flag=false;
    @Override
    public void run() {
        synchronized (this){
            while(!flag){
                try {
                    System.out.println("fire2");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("fire");
                System.out.println(Thread.currentThread().isInterrupted());
            }
        }
    }
    public synchronized void syn(){
        this.flag=true;
        notify();
    }
    public static void main(String[] args) throws InterruptedException {
        SynchronizedTest01 s=new SynchronizedTest01();
        s.start();
        Thread.sleep(1000);
        System.out.println("fire1");
        s.syn();
        System.out.println("11111111111111111");
    }
}


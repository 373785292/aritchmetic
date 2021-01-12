package 多线程.thread;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/24 19:22
 */

public class TreadTest03 extends Thread{
    private int i=0;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        while(true){
            i++;
            System.out.println(i);// 同步方法
        }
    }
}

class Runtest{
    public static void main(String[] args) throws InterruptedException {
        TreadTest03 t=new TreadTest03();
        t.start();
        Thread.sleep(1000);
        t.suspend(); // 挂起线程，如果此线程拿到锁后，并挂起，就会一直占用锁资源
        t.resume(); // 解开调用suspend方法挂起的线程(此处解开后会陷入while的循环当中，所以还是不会输出main end)
        System.out.println("main end");

    }

}

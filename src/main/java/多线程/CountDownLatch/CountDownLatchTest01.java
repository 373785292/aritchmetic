package 多线程.CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RunnableFuture;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/16 0:06
 */

// 闭锁：在完成某些运算时，只有其他所有线程的运算全部完成，当前运算才能继续完成
public class CountDownLatchTest01 {
    public static void main(String[] args) {
        CountDownLatch  ctdl=new CountDownLatch(5);
        CountDownLatchT1 c=new CountDownLatchT1(ctdl);
        long t1=System.currentTimeMillis();
        for(int i=0;i<5;i++){
            new Thread(c).start();
        }
        try {
            ctdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long t2=System.currentTimeMillis();
        System.out.println("执行时间:"+(t2-t1));
    }

}

class CountDownLatchT1 implements Runnable {
    private CountDownLatch countDownLatch;
    private int sum=0;

    public CountDownLatchT1(CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }
    @Override
    public void run() {
        synchronized (this){
            try{
                for (int i = 0; i <100000 ; i++) {
                    if(i%2==0){
                        System.out.println(i);
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                countDownLatch.countDown();
            }
        }
    }
}

package csdn.多线程;

/**
 * @description:
 * @author: hbh
 * @time: 2021/1/1 15:27
 */
// 内存可见性
public class ThreadTest01 {
    private  static  boolean flag=false;
    public static void main(String[] args) throws InterruptedException {
        Thread01 t=new Thread01();
        t.start();
        Thread.sleep(1000); // 主线程休息1秒
        flag=true;
        System.out.println("主线程修改flag值，主线程结束");
    }
    static class Thread01 extends Thread{
        @Override
        public void run() {
            while(!flag){
                synchronized (this){

                }
               /* try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                    //System.out.println("1");
            }
            System.out.println("子线程结束");
        }
    }
}



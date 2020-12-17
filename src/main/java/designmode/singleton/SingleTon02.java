package designmode.singleton;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/1 19:40
 * 单例模式  第二种  懒汉式。 需要的时候才会new出对象
 *
 * 两种写法， 线程安全和线程不安全两种写法
 */

public class SingleTon02 {
    private static  SingleTon02 INSTANCE;

    public static  SingleTon02 getInstance(){
        // 存在线程不安全，可以加synchronized锁， 双重校验锁
        if(INSTANCE==null){
            synchronized (SingleTon02.class){
                try{
                    Thread.sleep(1);
                    if(INSTANCE==null){
                        INSTANCE=new SingleTon02();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(()-> System.out.println(SingleTon02.getInstance().hashCode())).start();
        }
    }
}

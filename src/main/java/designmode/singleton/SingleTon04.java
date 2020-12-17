package designmode.singleton;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/3 10:46
 *
 * 单例模式     静态内部类
 */

// 类只加载一次，所以能够保证静态内部类也只加载一次，所以实例对象只有这一个。
public class SingleTon04 {
    // 静态内部类
    public static class SingleTon04Holder{
        private static SingleTon04 singleTon04=new SingleTon04();
    }

    public static SingleTon04 getInstance(){
        return SingleTon04Holder.singleTon04;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(SingleTon04.getInstance().hashCode());
            }).start();
        }
    }
}

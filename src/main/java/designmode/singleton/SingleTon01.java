package designmode.singleton;

/**
 * @description:
 * @author: hbh
 * @time: 2020/11/30 20:14
 * 单例模式 一种实例  自己负责创建自己对象  不管用不用先new出来，有点浪费内存空间
 * 第一种  饿汉式
 */

public class SingleTon01 {
    private static final SingleTon01 singleTon01=new SingleTon01();


    // 构造私有
    private SingleTon01(){

    }

    public  static SingleTon01 getInstance(){
        return singleTon01;
    }

    public static void main(String[] args) {
        SingleTon01 singleTon01=SingleTon01.getInstance();
        SingleTon01 singleTon02=SingleTon01.getInstance();
        System.out.println(singleTon01==singleTon02);


    }
}

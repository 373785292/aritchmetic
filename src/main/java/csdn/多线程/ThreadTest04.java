package csdn.多线程;

/**
 * @description:
 * @author: hbh
 * @time: 2021/1/2 14:41
 */

public class ThreadTest04 {
    static final Object o=new Object();
    static int number=0;

    public static void main(String[] args) {
        synchronized (o){
            number++;
        }
    }
}

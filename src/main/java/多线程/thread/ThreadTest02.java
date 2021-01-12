package 多线程.thread;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;


/**
 * @description:
 * @author: hbh
 * @time: 2020/12/21 19:42
 */
// join
@Slf4j(topic = "ThreadTest02")
public class ThreadTest02 {
    private static int r=0;
    static Logger l= LoggerFactory.getLogger(ThreadTest02.class);

    public static void main(String[] args) throws InterruptedException {
        test01();
    }

    private static void test01() throws InterruptedException {
        l.debug("开始");
        Thread t1=new Thread(()->{
            l.debug("开始");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            r+=10;
            l.debug("结束");
        });
        t1.start();
        t1.join();
        System.out.println("结果为"+r);
        l.debug("结束");
    }
}

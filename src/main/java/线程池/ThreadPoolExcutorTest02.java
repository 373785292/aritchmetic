package 线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: hbh
 * @time: 2021/1/6 17:01
 */
// 创建一个可缓存的线程池
public class ThreadPoolExcutorTest02 {
    public static void main(String[] args) {
        // 创建一个可缓存的线程池
        ExecutorService cachedTheardPool= Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 打印正在执行的缓存线程信息
            cachedTheardPool.execute(()-> {
                System.out.println(Thread.currentThread().getName()+"正在被执行");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        // 用完关闭
        cachedTheardPool.shutdown();
    }
}

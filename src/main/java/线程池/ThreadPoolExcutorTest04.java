package 线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: hbh
 * @time: 2021/1/6 17:21
 */
// 创建一个定长线程池，支持定时及周期性任务-延迟执行
public class ThreadPoolExcutorTest04 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool= Executors.newScheduledThreadPool(5);
        for (int i = 0; i <10 ; i++) {
            scheduledThreadPool.scheduleAtFixedRate(()->{
                System.out.println("延迟1秒后每3秒执行一次");
            },1,3, TimeUnit.SECONDS);
        }
        //scheduledThreadPool.shutdown();
    }
}

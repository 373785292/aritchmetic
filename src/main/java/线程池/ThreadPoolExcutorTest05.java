package 线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: hbh
 * @time: 2021/1/6 17:27
 */

public class ThreadPoolExcutorTest05 {
    public static void main(String[] args) {
        ExecutorService singleThreadExecutor= Executors.newSingleThreadExecutor();
        for (int i = 0; i <10 ; i++) {
            final int index=i;
            singleThreadExecutor.execute(()-> System.out.println(Thread.currentThread().getName()+"正在被执行，打印的值是"+index));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        singleThreadExecutor.shutdown();
    }
}

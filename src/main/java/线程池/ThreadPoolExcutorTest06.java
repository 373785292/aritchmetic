package 线程池;

import java.util.concurrent.*;

/**
 * @description:
 * @author: hbh
 * @time: 2021/1/6 18:23
 */

public class ThreadPoolExcutorTest06 implements  Runnable{
    @Override
    public void run() {
        // 打印正在执行的线程
        System.out.println(Thread.currentThread().getName()+"正在执行该任务");
        try {
            // 1秒保证3个任务分别在3个线程上执行
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // 创建数组型缓冲等待队列   规定大小的BlockingQueue，其构造方法必须指定大小
        BlockingQueue<Runnable> bq=new ArrayBlockingQueue<Runnable>(10);
        // 大小不固定的BlockingQueue，若其构造时指定大小，生成的BlockingQueue有大小限制，
        // 不指定大小，其大小有Integer.Max_VALUE来决定 其所含的对象是FIFO顺序排序的
        LinkedBlockingQueue<Runnable> lb=new LinkedBlockingQueue<>();
        // 类似LinkedBlockingQueue,但是其所含对象的排序不是FIFO，而是依据对象的自然顺序或者构造函数的Comparator决定
        PriorityBlockingQueue pbq=new PriorityBlockingQueue();
        // 特殊的BlockingQueue，对其的操作必须是放和取交替完成
        SynchronousQueue synchronousQueue=new SynchronousQueue();
        // ThreadPoolExecutor创建自定义线程池，池中保存的线程数为3，允许最大的线程数为6
        ThreadPoolExecutor tpe=new ThreadPoolExecutor(3,6,
                50, TimeUnit.SECONDS,bq);
        // 创建3个任务
        Runnable t1=new ThreadPoolExcutorTest06();
        Runnable t2=new ThreadPoolExcutorTest06();
        Runnable t3=new ThreadPoolExcutorTest06();
        Runnable t4=new ThreadPoolExcutorTest06();
        Runnable t5=new ThreadPoolExcutorTest06();
        Runnable t6=new ThreadPoolExcutorTest06();

        tpe.execute(t1);
        tpe.execute(t2);
        tpe.execute(t3);

        tpe.execute(t4);
        tpe.execute(t5);
        tpe.execute(t6);

        tpe.shutdown();


    }
}

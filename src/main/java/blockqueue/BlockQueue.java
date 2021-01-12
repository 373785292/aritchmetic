package blockqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/17 20:00
 */

public class BlockQueue<T> {
    // 1.任务队列
    private Deque<T> queue=new ArrayDeque<>();
    // 2.锁
    private Lock l=new ReentrantLock();
    // 3.生产者
    private Condition production= l.newCondition();
    // 4.消费者
    private Condition consumer=l.newCondition();
    // 5.容量
    private int capacity;

    public BlockQueue(int capacity) {
        this.capacity = capacity;
    }

    // 带超时的阻塞获取
    public T poll(long timeout, TimeUnit unit) {
        l.lock();
        try {
            long nanos = unit.toNanos(timeout);
            while (queue.isEmpty()) {
                try {
                    if (nanos <= 0) {
                        return null;
                    }
                    // 返回的是剩余时间
                    nanos = consumer.awaitNanos(nanos);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            T t = queue.removeFirst();
            return t;
        } finally {
            l.unlock();
        }
    }
    // 阻塞获取
    public T take(){
        l.lock();
        try{
            while(queue.isEmpty()){
                // 消费者等待
                try {
                    consumer.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            T t = queue.removeFirst();
            production.signal();
            return t;
        } finally {
            l.unlock();
        }
    }

    // put
    public void put(T element){
        l.lock();
        try{
            while(queue.size()==capacity){
                try {
                    production.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.addLast(element);
            consumer.signal();
        }finally {
            l.unlock();
        }
    }

    public int size(){
        try{
            l.lock();
            return queue.size();
        }finally {
            l.unlock();
        }
    }
}

class Threadpool{
    private BlockQueue<Runnable> taskQueue;
    // 线程池容量
    private int coreSize;
    //
    private long timeout;
    //
    private TimeUnit unit;
    // 线程集合
    private HashSet<Worker> workers=new HashSet<>();

    public Threadpool(int coreSize, long timeout, TimeUnit unit,int queueCapcity) {
        this.coreSize = coreSize;
        this.timeout = timeout;
        this.unit = unit;
        this.taskQueue=new BlockQueue<>(queueCapcity);
    }

    class Worker{

    }
}


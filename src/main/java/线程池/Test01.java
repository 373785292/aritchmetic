package 线程池;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/9 17:30
 * 优化for循环
 */

public class Test01 {
    public static void main(String[] args) {
        long t1=System.currentTimeMillis();
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        Test01.m1(arr);
        long t2=System.currentTimeMillis();
        System.out.println(t2-t1); //毫秒
    }

    public static void m1(List<Integer> list){
        ExecutorService pool= Executors.newCachedThreadPool();
        for (int i = 0; i <list.size();i++) {
            Integer number=list.get(i);
            pool.execute(()->{
                try {
                    new Thread().sleep(1000);
                    System.out.println("[1]"+Thread.currentThread().getName()+"----"+number);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        pool.shutdown();
    }



    @Test
    public void test02(){
        long t1=System.currentTimeMillis();
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        for (Integer integer : arr) {
            System.out.print(integer);
        }
        long t2=System.currentTimeMillis();
        System.out.println();
        System.out.println(t2-t1); //毫秒
    }
}

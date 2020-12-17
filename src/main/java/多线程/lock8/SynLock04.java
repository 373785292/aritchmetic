package 多线程.lock8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/13 20:35
 */

public class SynLock04 {
    public static void main(String[] args) {
        //List<String> list=new ArrayList<>();
        List<String> list=new CopyOnWriteArrayList<>();
        for (int i = 0; i <10 ; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(Thread.currentThread().getName()+"   "+list);
            },String.valueOf(i)).start();
        }
    }
    @Test
    public void test01(){
        System.out.println(UUID.randomUUID().toString());
    }
}

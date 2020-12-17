package 多线程.callable;

import lombok.Synchronized;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/14 22:11
 */

public class CallableTest01{


    public static void main(String[] args) {
        Callable01 c=new Callable01();
        RunnableFuture<Integer> rf=new FutureTask<>(c);
        new Thread(rf,"A").start();
        new Thread(rf,"B").start();
        try {
            Integer number = rf.get();
            System.out.println(number);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}

class Callable01 implements Callable<Integer>{
    private Integer sum=0;
    @Override
    public  Integer call() throws Exception {
        for (int i = 0; i <=100 ; i++) {
            /*if(i%2==0){
                sum=sum+i;
            }*/
            sum+=i;
        }
        return sum;
    }
}


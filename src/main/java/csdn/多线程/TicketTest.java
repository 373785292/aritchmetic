package csdn.多线程;


import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: hbh
 * @time: 2021/1/1 13:54
 */
// 竞态条件
public class TicketTest {
    public static void main(String[] args){
        Ticket t = new Ticket();
        for(int i=0;i<4;i++){  // 模拟4家卖票机构
            new Thread(()-> {
                try {
                    t.sale();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },i+"").start();
        }
    }
}
class Ticket{
    // 假如一共100张票
    private static int ticketNumber=100;
    public void sale() throws InterruptedException {
       while(true){
           if(ticketNumber>0) {
               Thread.sleep(100);  // 这里停顿，是为了模拟出票的时间
               System.out.println("线程"+Thread.currentThread().getName()+"卖出了1张票还剩"+--ticketNumber+"张");
           }else{
               break;
           }
        }
    }
}
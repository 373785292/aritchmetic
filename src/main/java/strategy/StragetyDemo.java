package strategy;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/1 21:04
 * 策略模式
 */

public class StragetyDemo {
    /*
    * 创建表示各种策略的对象和一个行为随着策略对象改变而改变的context对象
    * 策略对象改变context对象的执行算法
    *
    * */
    public static void main(String[] args) {
        Context c1=new Context(new AddStragety());
        int stragetyAdd = c1.stragety(1, 2);
        System.out.println(stragetyAdd);
        Context c2=new Context(new SubStragety());
        int stragetySub= c2.stragety(1, 2);
        System.out.println(stragetySub);
        Context c3=new Context(new MulStragety());
        int stragetyMul = c3.stragety(1, 2);
        System.out.println(stragetyMul);

        int sb=1;
        int sa=1;
        int a=sb<=sa?1:-1;
        System.out.println(a);
    }
}

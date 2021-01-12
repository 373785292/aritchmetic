package designmode.factory;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/2 19:59
 */

public class CarFactory {
    public Moveable create(){
        System.out.println("生成car对象。。。。");
        return new Car();
    }
}

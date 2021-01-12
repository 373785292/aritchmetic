package designmode.factory;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/2 20:00
 */

public class PlaneFactory {
    public Moveable created(){
        System.out.println("创建Plane对象。。。");
        return new Plane();
    }
}

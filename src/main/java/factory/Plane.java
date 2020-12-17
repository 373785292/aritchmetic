package factory;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/2 19:59
 */

public class Plane  implements Moveable{
    @Override
    public void go() {
        System.out.println("飞机");
    }
}

package factory;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/2 20:04
 */

public class Main {
    public static void main(String[] args) {
        Moveable car = new CarFactory().create();
        car.go();
        Moveable plane = new PlaneFactory().created();
        plane.go();

    }
}

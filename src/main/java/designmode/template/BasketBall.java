package designmode.template;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/27 19:35
 */

public class BasketBall extends Game {
    @Override
    public void initialize() {
        System.out.println("拿起篮球");
    }

    @Override
    public void startPlay() {
        System.out.println("投篮");
    }

    @Override
    public void endPlay() {
        System.out.println("命中");
    }
}

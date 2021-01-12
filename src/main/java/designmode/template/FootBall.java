package designmode.template;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/27 19:36
 */

public class FootBall extends Game{
    @Override
    public void initialize() {
        System.out.println("拿起足球");
    }

    @Override
    public void startPlay() {
        System.out.println("踢球");
    }

    @Override
    public void endPlay() {
        System.out.println("命中");
    }
}

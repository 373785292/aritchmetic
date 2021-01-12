package designmode.template;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/27 19:52
 */

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game=new BasketBall();
        game.play();
        System.out.println("-------------------------");
        game=new FootBall();
        game.play();
    }
}

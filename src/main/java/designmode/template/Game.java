package designmode.template;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/27 19:23
 */
// 模板模式
public abstract class Game {
    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();

    public final void play(){
        initialize();;
        startPlay();
        endPlay();
    }
}

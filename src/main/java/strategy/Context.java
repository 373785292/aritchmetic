package strategy;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/1 20:50
 */

public class Context {
    private Stragety stragety;

    public Context(Stragety stragety){
        this.stragety=stragety;
    }

    public int stragety(int num1,int num2){
        return stragety.twoNums(num1,num2);
    }
}

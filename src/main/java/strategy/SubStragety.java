package strategy;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/1 20:51
 */

public class SubStragety implements Stragety{
    @Override
    public int twoNums(int numOne, int numTwo) {
        return numOne-numTwo;
    }
}

package strategy;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/1 20:52
 */

public class MulStragety implements Stragety {
    @Override
    public int twoNums(int numOne, int numTwo) {
        return numOne*numTwo;
    }
}

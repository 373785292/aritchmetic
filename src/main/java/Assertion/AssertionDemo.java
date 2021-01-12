package Assertion;

/**
 * @description:
 * @author: hbh
 * @time: 2021/1/3 17:46
 */

// 断言学习
public class AssertionDemo {
    static int i=6;
    public static void main(String[] args) {
        assert i==6;
        System.out.println("如果断言成功，我讲被打印");
    }
}

class AssertionDemo2{
    public static void main(String[] args) {
        int i=3;
        switch (i){
            case 1:
                System.out.println("正常");
                break;
            case 2:
                System.out.println("正常");
                break;
            case 4:
                System.out.println("正常");
                break;
            default:
                assert false:"非正常";
                break;
        }
        System.out.println("如果断言正常，能够输出此语句");
    }
}
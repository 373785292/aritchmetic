package exception;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/17 17:33
 */

public class ExceptionTest01 extends Throwable {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

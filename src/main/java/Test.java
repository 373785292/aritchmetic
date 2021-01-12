import javax.management.relation.RoleList;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * description: Test <br>
 * date: 2020/8/2 11:11 <br>
 * author: HP <br>
 * version: 1.0 <br>
 */
public class Test {
    public static void main(String[] args) {
       /* BigDecimal big=new BigDecimal(11).setScale(2);
        System.out.println(big);
        System.out.println(big.ZERO);*/

        /*ArrayList arr=new ArrayList();
        arr.add(10);
        arr.set(0,2);
        System.out.println(arr.toString());
        BigDecimal big=new BigDecimal(11).setScale(4).divide(BigDecimal.valueOf(5.6), RoundingMode.DOWN);
        System.out.println(big);

        BigDecimal big1= new BigDecimal(12).setScale(2).divide(BigDecimal.valueOf(5), RoundingMode.DOWN);
        System.out.println(big1);

        BigDecimal b1=new BigDecimal(6);
        BigDecimal b2=new BigDecimal(3);
        BigDecimal b3;
        // 0 -> BigDecimal.Round_UP
        b3=b1.setScale(4).divide(b2,RoundingMode.DOWN);
        System.out.println(b3);

        BigDecimal b4=new BigDecimal(2.2343).setScale(2,BigDecimal.ROUND_UP);
        System.out.println(b4);*/

        int dd=100;
        test01(dd);


    }

    public static void test01(int num){
        ArrayList arr=new ArrayList();
        if(num>99){
            return;
        }
        if(num<102){
            System.out.println(102);
        }
    }

}
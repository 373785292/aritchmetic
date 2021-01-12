package bigdecimal;

import javafx.util.converter.BigDecimalStringConverter;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/26 13:25
 */
// 测试BigDecimal的坑
public class BigDecimalTest01 {
    @Test
    public void test01(){
        double d1=0.1;
        double d2=0.1;
        double d3=0.2451;
        float f1=0.1f;
        BigDecimal b1=new BigDecimal(d1);
        BigDecimal b2=BigDecimal.valueOf(d2);
        System.out.println(d3);
        BigDecimal b3= BigDecimal.valueOf(f1);
        BigDecimal b4= new BigDecimal(String.valueOf(f1));
        BigDecimal b5=new BigDecimal(d3);
        System.out.println(b5);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("没有使用String.valueOf()方法->  "+b3);
        System.out.println("使用了String.valueOf()方法->  "+b4);
        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1.compareTo(b2));
    }

    @Test
    public void test02(){
        long l1=13;
        BigDecimal b1=new BigDecimal(l1);
        System.out.println(b1);
    }

    @Test
    public void test03(){
        BigDecimal b1=new BigDecimal(new BigInteger("1000000000000000"));
        System.out.println(b1);
    }

    @Test
    public void test04(){
        BigDecimal b1=BigDecimal.valueOf(9.9f).multiply(BigDecimal.valueOf(100f));
        BigDecimal b2=new BigDecimal(9.9f).multiply(new BigDecimal(100f));
        BigDecimal b3=new BigDecimal(String.valueOf(9.9f)).multiply(new BigDecimal(String.valueOf(100f)));
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }

    @Test
    public void test05(){
        float f1=9.9f;
        System.out.println(Double.valueOf(f1));

    }

    @Test
    public void test06(){
        System.out.println(new BigDecimal(0.00).equals(BigDecimal.ZERO));
        System.out.println(new BigDecimal("0.00").equals(BigDecimal.ZERO));
        System.out.println(0.00);
        System.out.println(new BigDecimal(0.00));
        System.out.println(new BigDecimal("0.00"));
        System.out.println(new BigDecimal("0.00").compareTo(BigDecimal.ZERO));
        System.out.println(BigDecimal.ZERO);
        System.out.println(new BigDecimal("0.00").scale());
        System.out.println(BigDecimal.ZERO.scale());
    }
    @Test
    public void test07(){
        String s="0.00";
        System.out.println(s.length());
        System.out.println(s.toCharArray());
        System.out.println(new BigDecimal(0.00).intValue());
        System.out.println(new BigDecimal("0.00").intValue());
        System.out.println(Double.doubleToLongBits(0.00));
    }

    @Test
    public void test08(){
        BigDecimal decimal1 = new BigDecimal("200");
        BigDecimal decimal2 = new BigDecimal("200.0");
        System.out.println(decimal1.equals(decimal2));
        System.out.println(decimal1.compareTo(decimal2));

        BigDecimal b1=new BigDecimal(99);
        BigDecimal b2=new BigDecimal(99.00);
        System.out.println(b1.equals(b2));
        System.out.println(b1.compareTo(b2));
    }

    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}

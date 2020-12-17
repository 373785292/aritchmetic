package 核心;

import org.junit.Test;
import static java.lang.Math.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: hbh
 * @time: 2020/11/15 21:13
 */

public class Test01 {

    @Test
    public void test01(){
        float f=3.1415926123123123f;
        double d=3.1415926123123123;
        System.out.println(f);
        System.out.println(d);

        double d1=2.0;
        double d2=1.1;
        System.out.println(d1-d2);

        char c='\u2122';
        System.out.println(c);
        char c1='\u0022';
        System.out.println(c1);
        char c2='\u0022'+'\u0022';
        System.out.println(c2);
        System.out.println(1111);
        System.out.println("\u0022+\u0022");

        int x=4;
        System.out.println(Math.sqrt(x));
        int y= (int) Math.sqrt(4);
        double pow = Math.pow(5, 2);
        System.out.println(pow); // double

        int i = Math.floorMod(-5 + 1, 12);
        System.out.println(i);

        byte b= (byte) 300;
        System.out.println();
        System.out.println(b);

        double dd=2.3;
        int a= (int) dd;
        System.out.println(dd);

        int aaa= (int) 3.3;
    }


    @Test
    public void test02(){
        System.out.println(LocalDateTime.now());
        System.out.println();
    }

    @Test
    public void test03(){
        ArrayList arr=null;
        arr.add("dfasdf");
        System.out.println(arr.toString());

    }
}

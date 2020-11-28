package cn.hbh.ac1;

import javafx.scene.effect.Bloom;

/**
 * @description:
 * @author: hbh
 * @time: 2020/11/18 22:55
 * 爬楼梯
 */

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(stair(5));
        System.out.println();
    }
    // 递归
    public static  int stair(int stair){
        if(stair<0){
            return 0;
        }
        if(stair==1||stair==2){
            return stair;
        }

        return stair(stair-2)+stair(stair-1);
    }

    // 2.循环迭代
    public static int loop(int stairs){
        if(stairs<0){
            return 0;
        }
        int one=2;
        int two=1;
        int sum=0;
        if(stairs==1||stairs==2){
            return stairs;
        }
        for(int i=0;i<stairs;i++){
            sum=one+two;
            two=one;
            one=sum;
        }
        return sum;
    }
}

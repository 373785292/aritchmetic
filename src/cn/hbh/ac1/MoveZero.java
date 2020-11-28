package cn.hbh.ac1;

import java.util.Arrays;

/**
 * 移动零
 */
public class MoveZero {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums){
      int j=0;
      for(int i=0;i<nums.length;i++){
          if(nums[i]!=0){
              nums[j]=nums[i];
              if(j!=i){
                  nums[i]=0;
              }
              j++;
          }
      }
        System.out.println(Arrays.toString(nums));
    }

}

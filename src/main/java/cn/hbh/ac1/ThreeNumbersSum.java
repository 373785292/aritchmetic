package cn.hbh.ac1;

import java.util.*;

/**
 * @description:
 * @author: hbh
 * @time: 2020/11/23 13:10
 * 三数之和
 */

public class ThreeNumbersSum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists.toString());


    }

    public static List<List<Integer>> threeSum(int [] nums)  {
        Set<List<Integer>> ss=new LinkedHashSet<>();

        Set<List<Integer>> result=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int target=j+1;target<nums.length;target++){
                    if(nums[i]+nums[j]==nums[target]*-1){
                        List<Integer>values=Arrays.asList(nums[i],nums[j],nums[target]);
                        result.add(values);
                    }
                }
            }
        }
       return new ArrayList<>(result);
    }
}

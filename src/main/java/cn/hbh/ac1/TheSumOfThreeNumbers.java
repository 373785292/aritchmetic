package cn.hbh.ac1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * description: TheSumOfThreeNumbers <br>
 * date: 2020/8/5 10:00 <br>
 * author: HP <br>
 * version: 1.0 <br>
 */
// 三数之和
public class TheSumOfThreeNumbers {
    public static void main(String[] args) {
        int[]nums={1, 0, 1, 2, -1, -4};

        List<List<Integer>> lists = threeSum(nums);
        for (List<Integer> list : lists) {
            System.out.println(list.toString());
        }
    }

    public static  List<List<Integer>> threeSum(int[] nums) {
        // 1.固定1个数
        // 2.创建2个指针
        // 3.对数组排序
        Arrays.sort(nums);

        // 4.如果三数之和大于0，则right往前移动
        // 5.如果三数之和小于0，则left往后移动
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int left=i+1; // 左指针
            int right=nums.length-1; // 右指针
            int target=0-nums[i]; // 目标值(固定的数nums[i])
            // 因为对数组进行排序了，所以nums[0]>0时，后面的数就不用比了
            if(nums[i]>0){
                break;
            }
            // 如果固定值跟之前的固定值一样，需要跳过。避免进行不必要的计算
            if(i==0||nums[i]!=nums[i-1]){
                while(left<right){
                    if(nums[left]+nums[right]==target){
                        arr.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        // 如果指针与下一个指向的指针的值如果相当，也必须要跳过，避免进行不必要的计算。
                        while(left<right&&nums[left]==nums[left+1]) left++;
                        while(left<right&&nums[right]==nums[right-1]) right--;
                        left++;
                        right--;
                    } else if (nums[left] + nums[right]>target) {
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return arr;
    }
}

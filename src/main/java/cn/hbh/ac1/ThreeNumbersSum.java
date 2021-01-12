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
        // -4 -1 -1 0 1 2
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists.toString());
    }

    public static List<List<Integer>> threeSum(int [] nums)  {
        // 1. 排序
        // 2. 给定一个nums[i]，使用左右指针 如 nums[L],nums[R]
        // 3. 如果 nums[i]>0，说明nums[L]与nums[R]，nums[i]相加不可能为0
        // 4. 如果 sum==0, nums[L]==nums[L++]，此时应该跳过  L++
        // 5. 如果 sum=0, nums[R]==nums[R++]，此时应该跳过 R++
        if(nums==null||nums.length<3){
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> l=new ArrayList();
        int number=0;
        for(int i=0;i<nums.length;i++){
            if(i>-0&&nums[i]==nums[i-1]) continue; // 去重
            if(number>0){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                number=nums[i];
                int sum=number+nums[left]+nums[right];
                if(sum==0){
                    l.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left<right && nums[left] == nums[left+1]) left++; // 去重
                    while (left<right && nums[right] == nums[right-1]) right--; // 去重
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return l;
    }
}

package cn.hbh.ac1;

import java.util.Arrays;
import java.util.HashMap;

//两数之和
public class TheSumOfTwoNumbers {
    public static void main(String[] args) {
        int[] nums=new int[]{2,7,9,11};
        int target=9;

        int[] ints = towNum(nums, target);
        System.out.println(Arrays.toString(ints));

    }

    public static int[] towNum(int[] nums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        //1.首先遍历，将所有数组存取到map集合中。
        //2.同时判断 target-nums[i]，此时得到的值是否在map集合中
        //如果有，get此值 得到value(也就是对应数组的下标值)，在获取此时nums[i]的下标值。返回此数组即可

        for(int i=0;i<nums.length-1;i++){
            map.put(nums[i],i);

            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(nums[i]),map.get(target-nums[i])};
            }
        }
        throw new IllegalArgumentException("No two sum value");
    }
}

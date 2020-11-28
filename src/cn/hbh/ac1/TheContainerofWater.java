package cn.hbh.ac1;

/**
 * @description:  盛最多的水容器
 * @author: hbh
 * @time: 2020/11/15 20:24
 */

public class TheContainerofWater{
    public static void main(String[] args) {
        int[] nums={1,8,6,2,5,4,8,3,7};
        maxArea(nums);
    }
    /**
     * @description:
     * @param height
     * @return: void
     * @author: hbh
     * @time: 2020/11/15 20:45
     */
    public static void maxArea(int[] height){
        int j=height.length-1; // j 右指针
        int max=0;
        for(int i=0;i!=j;){    // i 左指针
            int min=Math.min(height[i],height[j]);
            int a=height[i]<height[j]?i++:j--;
            max=Math.max(max,min*(j-i+1));
        }
        System.out.println(max);
    }
}

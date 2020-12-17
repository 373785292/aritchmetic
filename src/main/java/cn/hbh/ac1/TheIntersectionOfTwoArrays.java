package cn.hbh.ac1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//求两个数组的交集
public class TheIntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] num1={4,9,5};
        int[] num2={9,4,9,8,4};


        //int[] intersect = intersect(num1, num2);
        //System.out.println(Arrays.toString(intersect));


        //进阶：如果数组中的数字已经排好序，如何优化算法
        int[] ints = intersect1(num1, num2);
        System.out.println(Arrays.toString(ints));


    }


    //优化算法(数组已排好序)
    public static int[] intersect1(int[]num1,int[]num2){
        //1.首先创建2个指针
        //2.如果第一个指针与第二个指针的元素相等，此时将元素放入数组中，并将两个指针同时往后移动
        //3.如果第一个指针与第二个指针的元素并不相等，
        //      如果第一个指针元素小于第二个指针元素，此时挪动第一个指针。
        //      如果第一个指针元素大于第二个指针元素，此时挪动第二个指针。
        Arrays.sort(num1);
        Arrays.sort(num2);

        ArrayList<Object> arr = new ArrayList<>();

        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num2.length;j++){
                if(num1[i] == num2[j]){
                    arr.add(num1[i]);
                    i++;
                    j++;
                }else if(num1[i]>num2[j]){
                    j++;
                }else{
                    i++;
                }
            }
        }
        int[] arr1=new int[arr.size()];
        for(int i=0;i<arr1.length;i++){
            arr1[i]= (int) arr.get(i);
        }
        return arr1;
    }



    //intersect 交叉
    public static int [] intersect(int[] num1, int[] num2){
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        //求出num1出现的次数
        for(int i=0;i<num1.length;i++){
            if(map.containsKey(num1[i])){
                map.put(num1[i],map.get(num1[i])+1);
            }else{
                map.put(num1[i],1);
            }
        }

        for(int i=0;i<num2.length;i++){
            Integer count=map.get(num2[i]);   //2--2    2--1

            if(count!=null&&count!=0){
                arr.add(num2[i]);
                //为了防止数组中存在重复， 例如[4,9,4,9] 防止这种结果出现，只能让num2和num1数组中出现的次数的频次要一致。
                //// 每次匹配后，该数值的频次需要减 1（nums1 和 nums2 匹配的数值的频次要相同）
                map.put(num2[i],--count);  //2--1   2--0
            }
        }

        //返回int数组
        int []arr1=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            arr1[i]=arr.get(i);
        }
        return arr1;
    }
}

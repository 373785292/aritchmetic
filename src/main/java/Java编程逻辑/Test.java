package Java编程逻辑;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/3 10:57
 */

// Java 支持可变长度的参数
public class Test {
    public static int Max(int min,int ...a){
        int max=min;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }

    public static long Max(long min,long ...a){
        long max=min;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int max = Test.Max(0, 1, 9, 3, 10, 5);
        System.out.println(max);

        char c1='a';
        char c2='b';
        int max1 = Test.Max(c1, c2);
        System.out.println(max1);
    }
}

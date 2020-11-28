package cn.hbh.ac1;

/**
 * description: LongestCommonPrefix <br>
 * date: 2020/8/2 10:25 <br>
 * author: HP <br>
 * version: 1.0 <br>
 */

//最长公共前缀
public class LongestCommonPrefix {
    public static void main(String[] args) {
        //定义一个数组
        String[] str={"c","acc","ccc"};
        String s = longestCommonPrefix(str);
        //最长公共前缀
        System.out.println(s);
    }

    public static String longestCommonPrefix(String[] strs){

        if(strs==null||strs.length==0){
            return "";
        }


        String str=strs[0];


        //也可以使用indexof，indexof判断此字符串是否再原串中出现过，如果出现为0，如果没有出现为-1
        for(int i=1;i<strs.length;i++){
            String str1=strs[i];
            while(!str1.startsWith(str)){
                str=str.substring(0,str.length()-1);
            }
            if(str.length()==0){
                return "";
            }
        }
        return str;


        /**
         * if(strs.length == 0){
         *             return "";
         *         }
         *         String str = strs[0];
         *         for(int i = 1; i < strs.length; i++){
         *             while(strs[i].indexOf(str) != 0){
         *                 str=str.substring(0, str.length() - 1);
         *             }
         *         }
         *         return str;
         */
    }
}

package cn.hbh.ac1;

import java.util.Arrays;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/31 19:24
 */
// 有效的字母异位词
public class AnagramYouXiao {
    public static void main(String[] args) {
        String s="rat"; //anagram
        String t="car"; //nagaram
        boolean anagram = isAnagram(s, t);
        if(anagram){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static boolean isAnagram(String s, String t) {
        // 转换为字符数组
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        if(s1.length!=t1.length){
            return false;
        }
        Arrays.sort(s1); // aaagrmn
        Arrays.sort(t1); // aaagrmn
        for(int i=0;i<s.length();i++){
            if(s1[i]==t1[i]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}

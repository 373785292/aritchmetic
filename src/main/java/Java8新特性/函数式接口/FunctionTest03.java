package Java8新特性.函数式接口;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/28 13:41
 */

public class FunctionTest03 {
    public static void main(String[] args) {
        Student s1=new Student("小明",18);
        Student s2=new Student("小红",17);
        List<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        for (Student student : list) {
            test01(student);
        }
    }
    public static  void test01(Student student){
            if(student.getAge()%2==0){
                return;
            }else{
                System.out.println(student.getAge());
            }
    }
}

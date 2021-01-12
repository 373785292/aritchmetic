package Java8新特性.函数式接口;

import java.util.function.Function;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/27 21:27
 */

public class FunctionTest02 {
    public static void main(String[] args) {
       /* Student s1=new Student("小明",15);
        Integer stduent = getStduent(s1, (s) -> s.getAge());
        System.out.println(stduent);*/
        Student s1=new Student("小明",15);
        Integer stduent = getStduent(s1);
        System.out.println(stduent);
    }

    public static Integer getStduent(Student s1){
        Function<Student,Integer> fun=(s)->s.getAge();
        return fun.apply(s1);
    }
}

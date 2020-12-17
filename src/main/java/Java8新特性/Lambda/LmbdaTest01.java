package Java8新特性.Lambda;

import Java8新特性.Impl.FilterByAge;
import Java8新特性.Impl.FilterBySalary;
import Java8新特性.Impl.Mypredicate;
import Java8新特性.domain.Employee;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/3 14:09
 * Lmbda表达式练习
 */

public class LmbdaTest01 {
    @Test
    public void test01(){
       Comparator<Integer> com=new Comparator<Integer>() {
           public int compare(Integer o1, Integer o2) {
               return Integer.compare(o1,o2);
           }
       };

       TreeSet<Integer> t=new TreeSet<Integer>(com);
    }

    @Test
    public void test02(){
        Comparator<Integer> com1=(x,y) -> Integer.compare(x,y);
    }


    @Test
    public void test03(){

    }

    public static void main(String[] args) {
        List<Employee> arr= Arrays.asList(
                new Employee("张三",7000,18),
                new Employee("李四",9000,50),
                new Employee("王五",3000,5)
        );

        List<Employee> employees = LmbdaTest01.filterBySalary(arr);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
    // 过滤工资在5000以上工人
    public static List<Employee> filterBySalary(List<Employee> list){
        List<Employee> l=new ArrayList<Employee>();
        for (Employee employee : list) {
            if(employee.getSalary()>5000){
                l.add(employee);
            }
        }
        return l;
    }


    @Test
    public void test04(){
        List<Employee> arr= Arrays.asList(
                new Employee("张三",7000,18),
                new Employee("李四",9000,50),
                new Employee("王五",3000,5)
        );

        List<Employee> filter = LmbdaTest01.filter(arr, new FilterBySalary());
        for (Employee employee : filter) {
            System.out.println(employee);
        }
    }
    public static List<Employee> filter(List<Employee> list,Mypredicate<Employee> mp){
        List<Employee> l=new ArrayList<Employee>();
        for (Employee employee : list) {
            if(mp.verify(employee)){
                l.add(employee);
            }
        }
        return l;
    }


    @Test
    public void test05(){
        List<Employee> arr= Arrays.asList(
                new Employee("张三",7000,18),
                new Employee("李四",9000,50),
                new Employee("王五",3000,5)
        );
        arr.stream().filter((e)->e.getSalary()>15).limit(2).forEach(System.out::println);
    }
    // 匿名内部类
    @Test
    public void test06(){
        List<Employee> arr= Arrays.asList(
                new Employee("张三",7000,18),
                new Employee("李四",9000,50),
                new Employee("王五",3000,5)
        );
        List<Employee> l=filter(arr, new Mypredicate<Employee>() {
            @Override
            public boolean verify(Employee employee) {
                return employee.getSalary()>5000;
            }
        }).stream().collect(Collectors.toList());
        System.out.println(l);
    }
}

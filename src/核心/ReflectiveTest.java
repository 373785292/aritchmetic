package 核心;

import java.util.Random;

/**
 * @description:
 * @author: hbh
 * @time: 2020/11/23 19:42
 * 反射
 */

public class ReflectiveTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Employee e = new Employee("工人");
        String name = e.getClass().getName();
        System.out.println(name);


        // 通过getname()获取到包的名称
        Random generatro=new Random();
        Class aClass = generatro.getClass();
        String name1 = aClass.getName();
        System.out.println(name1);

        String className="核心.Employee";
        Class aClass1 = Class.forName(className);
        System.out.println(aClass1.getName());
        Object o = Class.forName(className).newInstance();

        // classNotException
        String className1="aaa";
        Class aClass2 = Class.forName(className1);
        System.out.println(aClass2.getName());

        // 获德class类对象的第三种方法非常简单。如果T是任意的java对象，T.class将代表匹配的类对象
    }
}


class Employee{
    private String name;
    public Employee(){

    }
    public Employee(String name){
        this.name=name;
    }

    public static void say(String animal){
        System.out.println(animal+"我会说话");
    }
}

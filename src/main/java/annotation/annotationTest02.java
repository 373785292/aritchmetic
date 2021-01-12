package annotation;

import org.junit.Test;

public class annotationTest02 {
    public static void main(String[] args) {
        String name="hbh";
        Class<? extends String> c1 = name.getClass();
        Class c2=name.getClass();
        System.out.println(c1);
        System.out.println(c2);
    }

    @Test
    public void test01(){
        String name="hbh";
        try {
            Class<?> stringClass = Class.forName("java.lang.String");
            System.out.println(stringClass);
            // 受检异常
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test02(){
        Class c1=Boolean.TYPE;
        System.out.println(c1);
    }
}
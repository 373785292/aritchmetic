package annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;

public class annotationTest03 {
    public static void main(String[] args) {
        Student s=new Student();
        Class<? extends Student> student = s.getClass();
        for(int i=0;i<student.getConstructors().length;i++){
            System.out.print(Modifier.toString(student.getConstructors()[i].getModifiers())+"参数：");
            Class<?>[] parameterTypes = student.getConstructors()[i].getParameterTypes();
            for (int j= 0; j < parameterTypes.length; j++) {
                System.out.print(parameterTypes[j].getName()+"    ");
            }
            System.out.println();
        }

    }
}
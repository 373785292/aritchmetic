package annotation;

/**
 * @description:
 * @author: hbh
 * @time: 2021/1/6 23:20
 */
// 注解
public class annotaitonTest01 {
    public static void main(String[] args) {
        try {
            Class<?> c1=Class.forName("java.util.HashMap");
            System.out.println(c1.getName());
            Class<?> c2 = int.class;
            System.out.println(c2.getName());
            Class<int[]> c3 = int[].class;
            System.out.println(c3.getName());
            Class<String> c4 = String.class;
            System.out.println(c4.getName());
            // 引用类型数组后有；号
            Class<String[]> c5 = String[].class;
            System.out.println(c5.getName());
            Class<Comparable> c6 = Comparable.class;
            System.out.println(c6.getName());
            System.out.println(c6.getSimpleName());
            System.out.println(c6.getCanonicalName());
            System.out.println(c6.getPackage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

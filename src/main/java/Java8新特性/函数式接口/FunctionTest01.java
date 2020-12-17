package Java8新特性.函数式接口;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/3 18:24
 */
// Function函数式接口
public class FunctionTest01 {
    // Consumer消费接口
    @Test
    public void test01(){
        StringBuilder sb=new StringBuilder("hello ");
        Consumer<StringBuilder> consumer=(str)->str.append("Jack!");
        //consumer.accept(sb);
        //System.out.println(sb.toString());


        Consumer<StringBuilder> consumer1=(str)->str.append("Hello world");
        // 返回一个组合函数，after将在函数执行之后应用
        consumer.andThen(consumer1).accept(sb);
        System.out.println(sb.toString());
    }



    @Test
    // Consumer 消费式接口
    public void test02(){
        FunctionTest01.consumerMoney(100,(x)-> System.out.println("我消费了"+x+"元"));
    }
    public static void consumerMoney(int money,Consumer<Integer> con){
        con.accept(money);
    }



    // Supplier 供应式接口
    @Test
    public void test03(){
        FunctionTest01.supplierTest(10,()->(int)(Math.random()*100));
    }

    public static void supplierTest(Integer number, Supplier<Integer> sup){
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<number;i++)
            arr.add(sup.get());

        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }

    // Function<T> 函数式接口
    // 计算字符串
    @Test
    public void teset04(){
        // R apply<T t> 将对象输入到函数上，返回计算接口
        String s1 = FunctionTest01.funcString("\t\t\t hello world  ", (s) -> s.trim());
        System.out.println(s1);
        // substring  左包右不包
        String s2 = FunctionTest01.funcString("helloworld", (s) -> s.substring(0, 3));
        System.out.println(s2);
    }
    // T 入参 R 返回接口
    public static String funcString(String str,Function<String,String> fun){
            return fun.apply(str);
    }

    // Predicate<T> 断言式接口
    @Test
    public void test05(){
        String[] str={"hello","world","www","ok"};
        for(int i=0;i<str.length;i++){
            List<String> strings = FunctionTest01.predBoolean(str[i], (s) -> s.length() > 3);
            for (String string : strings) {
                System.out.println(string);
            }
        }
    }
    public static List<String> predBoolean(String str, Predicate<String> pre){
        List<String> l=new ArrayList<>();
        if(pre.test(str)){
            l.add(str);
        }
        return l;
    }



    @Test
    public void test06(){
        List<Double> strings = Arrays.asList(8.31, 1.89, 0.01);

        Optional<Double> reduce = strings.stream().reduce((x, y) -> x+y);
        System.out.println(reduce.get());

    }

    @Test
    public void test07(){
        int i=0;
        List<Double> strings = Arrays.asList(8.31, 1.89, 0.01);
        Double[] volumes=new Double[strings.size()];
        for (Double string : strings) {
            volumes[i]=string;
            i++;
        }
        System.out.println(i);
    }

    @Test
    public void test08(){
        BigDecimal big=new BigDecimal(5.2);
        int i = big.compareTo(new BigDecimal(2.2));
        System.out.println(i);
    }
}

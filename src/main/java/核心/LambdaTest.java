package 核心;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: hbh
 * @time: 2020/11/26 20:03
 */

public class LambdaTest implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }

    public static void main(String[] args) {
        String[] strings={"ba","gsdfds","dsaf"};
        List<String> collect = Arrays.stream(strings).sorted((a, b) -> {
            if (a.length() < b.length()) {
                return -1;
            }
            if (a.length() > b.length()) {
                return 1;
            }
            return 0;
        }).collect(Collectors.toList());

        System.out.println(collect.toString());



    }
}

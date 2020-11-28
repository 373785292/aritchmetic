package 核心;

import java.util.Arrays;

/**
 * @description:
 * @author: hbh
 * @time: 2020/11/23 18:31
 */

public enum Size {
    SMALL("S"),MEDIUM("M");
    private String abbreviation;

    private Size(String abbreviation){
        this.abbreviation=abbreviation;
    }


    public String getAbbreviation(){
        return abbreviation;
    }
};

class Test{
    public static void main(String[] args) {
        // toString方法可以返回枚举常量名
        System.out.println(Size.SMALL.toString());
        // 将s设置为Size.SMALL
        Size small = Enum.valueOf(Size.class, "SMALL");
        System.out.println(small);

        // 每个枚举类型都有一个静态的values方法，它将返回一个包含全部枚举值的数组
        Size[] values = Size.values();
        for (Size value : values) {
            System.out.println(value.toString());
        }
        // ordinal方法返回enum声明中枚举常量的位置，位置从0开始计数
        int ordinal = Size.MEDIUM.ordinal();
        System.out.println(ordinal);
    }
}

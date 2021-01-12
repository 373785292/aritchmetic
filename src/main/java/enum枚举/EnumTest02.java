package enum枚举;

// 学习枚举方法
public class EnumTest02 {
    public static void main(String[] args) {
        // 返回一个枚举数组
        System.out.println(Size.values());
        System.out.println(Size.valueOf("LARGE"));
        for(int i=0;i<Size.values().length;i++){
            System.out.println("枚举成员 "+Size.values()[i]);
        }
    }
}

enum Size{
    LARGE,SMALL,MIDDLE
}
package enum枚举;


// 使用接口组织枚举
public interface Food {
    enum coffee implements Food{
        BLACK_COFFEE,DECAF_COFFEE,LATTE,CAPPUCCINO;
    }
    enum animals implements Food{
        MEAT,FISH,PIG;
    }


}
class EnumTest05{
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        for (Food.coffee value : Food.coffee.values()) {
            System.out.println(value+" ");
        }
        System.out.println();
        for (Food.animals value : Food.animals.values()) {
            System.out.println(value+" ");
        }
        System.out.println();
        // 多态
        Food food=Food.coffee.LATTE;
        System.out.println(food);
        Food pig = Food.animals.PIG;
        System.out.println(pig);
    }
}
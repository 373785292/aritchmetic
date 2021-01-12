package enum枚举;

enum Color{
    RED,GREEN,BLACK
}
// 枚举
public class EnumTest01 {
    public static void main(String[] args) {
        EnumTest01 enum01=new EnumTest01();
        System.out.println(Color.RED.name());
        enum01.change();
    }
   Color color= Color.RED;
    public  void change(){
        switch (color){
            case RED:
                color=Color.GREEN;
                System.out.println("绿色");
                break;
            case GREEN:
                color=Color.BLACK;
                break;
            case BLACK:
                color=color.RED;
                break;
            default:
                System.out.println("没有相关颜色");
                break;
        }
    }
}


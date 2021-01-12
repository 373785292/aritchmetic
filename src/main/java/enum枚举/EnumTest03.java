package enum枚举;


import lombok.Data;

//自定义自己的方法

public enum  EnumTest03 {
    RED("红色",1),GREEN("绿色",2),BLANK("白色",3),YELLO("绿色",4);
    private String name;
    private int index;
    // 构造方法
    EnumTest03(String name, int index) {
        this.name=name;
        this.index=index;
    }

    @Override
    public String toString() {
        return this.index+"_"+this.name;
    }

    // 自定义方法
    public static String getName(int index){
        for (EnumTest03 value : EnumTest03.values()) {
            if(value.getIndex()==index){
                return value.name;
            }
        }
        return null;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static void main(String[] args) {
        String name = getName(1);
        System.out.println(name);
        // 枚举成员都是一个实例。 默认被public static final 修饰，可以直接使用枚举类名调用
        System.out.println(EnumTest03.GREEN.toString());
    }
}
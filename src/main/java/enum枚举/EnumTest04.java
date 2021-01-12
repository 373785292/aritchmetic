package enum枚举;

// 用法五 实现接口    因为枚举类会继承java.lang.Enum类，java不能多继承，所以不能在继承其他类。只能去实现接口
public enum  EnumTest04 implements Behavior{
    LARGE("大",0),SMALL("小",2),MIDDLE("中",3);
    private String name;
    private int index;
    private EnumTest04(String name,int index){
        this.name=name;
        this.index=index;
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

    @Override
    public void print() {
        System.out.println(this.name+"_"+this.index);
    }

    @Override
    public String getInfo() {
        return this.name;
    }

    public static void main(String[] args) {
        // 返回name
        String info = EnumTest04.LARGE.getInfo();
        System.out.println(info);
        // 返回index位置
        int index = EnumTest04.SMALL.getIndex();
        System.out.println(index);
        // 实例对象调用方法
        EnumTest04.LARGE.print();
    }
}

interface Behavior{
    void print();
    String getInfo();
}
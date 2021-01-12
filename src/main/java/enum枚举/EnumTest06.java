package enum枚举;

// 测试ordinal
public class EnumTest06 {
    public static void main(String[] args) {
        String nameOrdinal = getOrdinal(Sizes.LARGE);
        System.out.println(nameOrdinal);
        int i = compareTo(Sizes.LARGE, Sizes.SMALL);
        System.out.println(i);
    }

    public static String getOrdinal(Enum e){
        for (Sizes value : Sizes.values()) {
            if(value==e){
                return e.name()+"_"+e.ordinal();
            }
        }
        return null;
    }

    public static int compareTo(Enum other,Enum another){
        if(other.ordinal()>another.ordinal()){
            return 1;
        }else if(other.ordinal()<another.ordinal()){
            return -1;
        }else{
            return 0;
        }
    }
}

enum Sizes{
    LARGE,SMALL,MIDDLE
}
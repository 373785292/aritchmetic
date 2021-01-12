package enum枚举;


public class EnumTest07 {
    private int id;
    private TypeEnum type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public static void main(String[] args) {
        EnumTest07 e7=new EnumTest07();
        e7.setType(TypeEnum.AUDIO);
    }
}


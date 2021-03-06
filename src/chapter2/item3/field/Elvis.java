package chapter2.item3.field;

// Singleton with public final field  (Page 17)
public class Elvis {

    public static final Elvis INSTANCE = new Elvis();

    private Elvis(){}

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}

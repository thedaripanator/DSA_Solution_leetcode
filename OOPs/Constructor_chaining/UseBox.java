package OOPs.Constructor_chaining;

public class UseBox {
    static void main() {
        Box b1=new Box(10,20,30);
        Box b2=new Box(15);
        Box b3=new Box();
        b1.show();
        b2.show();
        b3.show();
    }
}

package OOPs.Polymorphism;

public class UseShape {
    static void main() {
        Shape s=new Shape();
        s.area('A');
        s.area(10.0);
        s.area(5,7);
    }
}

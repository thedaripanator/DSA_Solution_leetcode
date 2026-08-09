package OOPs.FinalDemo;

public class Circle {
    private int rad;
    private final double pi;

    public Circle(int rad){
        this.rad=rad;
        pi=3.14;
    }
    public void show(){
        System.out.println("Radius Of the circle :"+rad);
        System.out.println("pi is :"+pi);
    }
}

package OOPs.StaticDemo;

class Demo {
    int a;
    static int b;
}

public class StaticDemo1 {
    static void main() {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        d1.a=10;
        d2.a=20;
        d3.a=30;
        System.out.println("d1.a="+d1.a+",d2.a="+d2.a+",d3.a="+d3.a);
        Demo.b=10;
        Demo.b=20;
        Demo.b=30;
        System.out.println("d1.b="+Demo.b+",d2.b="+Demo.b+",d3.b="+Demo.b);
     }
}

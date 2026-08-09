package OOPs.Polymorphism;

public class Shape {
    public void area(double radius){
        double area=Math.PI*Math.pow(radius,2);
        System.out.println("Area of Circle="+area);
    }
    public void area(int side){
        int area=side*side;
        System.out.println("Area of Square ="+area);
    }

    public void area(int length,int breadth){
        int area=length*breadth;
        System.out.println("Area of the Rectangle ="+area);
    }
}

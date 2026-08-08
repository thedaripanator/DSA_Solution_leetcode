package OOPs.Constructor_chaining;

public class Box {
    private int length, breadth, height;

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public Box(int side) {
        this(side,side,side);
    }

    public Box() {
       this(0,0,0);
    }

    public void show() {
        System.out.println("Length=" + length + ",Breadth=" + breadth + ",Height=" + height);
    }
}

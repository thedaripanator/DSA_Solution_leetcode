package OOPs.ArgumentPassing;

public class PassByValue {
    static void main() {
        int x = 10, y = 20;
        System.out.println("Before Incrementing,x=" + x + "y=" + y);
        increment(x, y);
        System.out.println("After Incrementing,x=" + x + "y=" + y);
    }

    public static void increment(int x, int y) {
        x = x + 5;
        y = y + 5;
    }
}

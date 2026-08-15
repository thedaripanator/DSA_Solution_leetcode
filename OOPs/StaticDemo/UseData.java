package OOPs.StaticDemo;
class Data{
    static int a=10;
    static {
        System.out.println("Static block Called");
    }
    public Data(){
        System.out.println("Constructor Called");
    }

//    public static void show(){
//        System.out.println("Show Called..");
//    }
}
public class UseData {
    static void main() {
        System.out.println(Data.a);   }
}

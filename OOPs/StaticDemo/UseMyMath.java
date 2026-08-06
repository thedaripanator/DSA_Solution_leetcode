package OOPs.StaticDemo;
class MyMath{
    public static int add(int a,int b){
        return a+b;
    }
}
public class UseMyMath {
    static void main(){
        System.out.println(MyMath.add(10,20));

    }
}

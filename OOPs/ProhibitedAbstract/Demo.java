package OOPs.ProhibitedAbstract;

class A {
   public static void show(){
       System.out.println("In show of A");
   }
}

class B extends A {
   public static void show(){
       System.out.println("In show of B");
   }
}

public class Demo {
    static void main() {
       A ref=new B();
       ref.show();
    }
}

package OOPs.Revision;

public class classExample {
    // data members
    private int a;
    private  int b;

    // methods
    public void set(int x,int y){
        a=x;
        b=y;
    }
    public int getA(){
        return a;
    }
    public  int getB() {
        return b;
    }
}

class Main{
    static void main() {
        classExample ob1;
        ob1=new classExample();
    }
}


//<access_modifier> class <class_name>{
//    // Data members

//    public int age;
//    private String name;

//    // methods
//    <access_modifier> return_type method_name(arguments){
//        // method body
//    }
//}

// public , private , Default

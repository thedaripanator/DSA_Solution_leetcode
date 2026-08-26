package OOPs.Revision.MethodOverLoading;

public class Addition {

    public int add(int a ,int b){
        return a+b;
    }

    public int add(int a , int b,int c){
        return a+b+c;
    }
    public String add(String st1,String st2){
        return st1+" "+st2;
    }

    public String add(String st1,int a){
        return st1+Integer.toString(a);
    }
    public String add(int a,String st1){
        return st1+Integer.toString(a);
    }
}

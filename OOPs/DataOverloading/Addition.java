package OOPs.DataOverloading;

public class Addition {
    public int add(int a, int b) {
        int x=a+b;
        return x;
    }
    public int add(int a,int b,int c){
        int d=a+b+c;
        return d;
    }
    public int add(int a,int b,int c,int d){
        int e=a+b+c+d;
        return e;
    }
    public double add(double i, double j) {
        double k=i+j;
        return k;
    }

    public String add(String s1,String s2){
        String res=s1+s2;
        return res;
    }
}

package OOPs.Revision.MethodOverLoading;

public class UseAddition {
    static void main() {
        Addition addition=new Addition();
        System.out.println(addition.add(10,20,30));
        System.out.println(addition.add("SayonDeep","Daripa"));
        System.out.println(addition.add(1,"XYZ"));
    }
}

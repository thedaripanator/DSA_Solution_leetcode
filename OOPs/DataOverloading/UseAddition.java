package OOPs.DataOverloading;

import java.util.Scanner;

public class UseAddition {
    static void main() {
        Scanner sc=new Scanner(System.in);
         Addition obj=new Addition();
        System.out.println("sum of 10 and 20:"+obj.add(10,20));
        System.out.println("Sum of 10,20 and 30 :"+obj.add(10,20,30));
        System.out.println("Sum of 10 , 20 , 30 and 40:"+obj.add(10,20,30,40));
    }
}

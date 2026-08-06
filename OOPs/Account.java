package OOPs;

import java.util.Scanner;

public class Account {
    private int accId;
    private String name;
    private double balance;

    private static double rateofInt;
    static{
        System.out.println("Enter the rate of Interest");
        Scanner sc=new Scanner(System.in);
        rateofInt=sc.nextDouble();
    }
    public Account(int accId,String name,double balance){
        this.accId=accId;
        this.name=name;
        this.balance=balance;
    }
    public void showAccount(){
        System.out.println("Id:"+accId);
        System.out.println("Name:"+name);
        System.out.println("Balance:"+balance);
    }
}

package OOPs;

public class Account {
    private int accId;
    private String name;
    private double balance;

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

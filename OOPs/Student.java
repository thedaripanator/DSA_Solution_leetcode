package OOPs;

public class Student {
    private int roll;
    private String  name;
    private double percentage;

    public void setstudents(int roll,String name,double p){
        this.roll=roll;
        this.name=name;
        this.percentage=p;
    }

    public void showStudents(){
        System.out.println("Roll:"+roll);
        System.out.println("Name:"+name);
        System.out.println("Percentage:"+percentage);
    }
}



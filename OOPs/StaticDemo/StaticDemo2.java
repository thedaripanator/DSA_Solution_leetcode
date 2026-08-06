package OOPs.StaticDemo;

class emp {
    private int age;
    private String name;
    private static String company = "Amazon";

    emp(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println("age:" + this.age + ",name:" + this.name + ",company=" + company);
    }
    // The company is static and if we made non static method then we have to call it for every function of the class

    public static void showCompany() {
        System.out.println("Company name is " + company);
    }
}

public class StaticDemo2 {
    static void main() {
        emp.showCompany();
        emp e = new emp(21, "Deepak");
        emp f = new emp(20, "Amit");
        emp g = new emp(23, "Ravi");
        e.display();
        f.display();
        g.display();
    }
}

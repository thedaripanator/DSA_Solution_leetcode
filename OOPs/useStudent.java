package OOPs;

public class useStudent {
    static void main() {
        Student s=new Student();
        s.setstudents(10,"sayon",98.9);
        s.showStudents();

        System.out.println("--------------------------");
        Student p=new Student();
        p.setstudents(20,"abhi",100);
        p.showStudents();
    }
}

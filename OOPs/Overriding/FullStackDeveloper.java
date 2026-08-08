package OOPs.Overriding;

public class FullStackDeveloper extends FrontendDeveloper{
    @Override
    public void mySkills() {
        System.out.println("I am a fullstack Developer");
        super.mySkills();
        System.out.println("I know backend Part using Node +Mongo+Express");
    }
}

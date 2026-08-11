package OOPs.Abstract;

public class UseLanguage {
    static void main() {
        Language li;
        li=new English();
        li.greetings();

        li=new Hindi();
        li.greetings();


        li=new French();
        li.greetings();
    }
}

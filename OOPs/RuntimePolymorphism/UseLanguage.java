package OOPs.RuntimePolymorphism;

public class UseLanguage {
    static void main() {
        Language lng;
        lng=new Hindi();
        lng.greetings();

        lng=new English();
        lng.greetings();

        lng=new French();
        lng.greetings();
    }
}

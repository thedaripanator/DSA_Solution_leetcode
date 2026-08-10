package OOPs.Binding;

public class UseBinding {
    static void main() {
        Parent p=new Parent();
        p.show();
        p.display();

        p=new Child();
        p.show();
        p.display();
    }
}

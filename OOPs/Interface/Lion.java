package OOPs.Interface;

public class Lion implements Animal{
    @Override
    public void makeSound() {
        System.out.println("A lion Roars");
    }

    @Override
    public void eat() {
        System.out.println("A Lion eats Flesh");
    }
}

package OOPs.Interface;

public class Elephant implements Animal{

    @Override
    public void makeSound() {
        System.out.println("An Elephant trumpet");
    }

    @Override
    public void eat() {
        System.out.println("Elephants eats grasses and leaves");
    }
}

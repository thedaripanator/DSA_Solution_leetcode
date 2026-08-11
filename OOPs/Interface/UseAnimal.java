package OOPs.Interface;

public class UseAnimal {
    static void main() {
        Animal animal;
        animal=new Elephant();
        animal.makeSound();
        animal.eat();



        animal=new Lion();
        animal.makeSound();
        animal.eat();
    }
}

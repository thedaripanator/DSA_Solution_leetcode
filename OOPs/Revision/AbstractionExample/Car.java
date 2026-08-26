package OOPs.Revision.AbstractionExample;

public class Car {
    public void movePiston(){

    }
    public void moveBreakPads(){

    }
    public void createSpark(){
        System.out.println("Sparking Started.......");
    }

    public void turnOnCar(){
        System.out.println("Turning on the car.....");
        createSpark();
    }

    public void accelerate(){
        movePiston();
    }
    public void applyBreak(){
        moveBreakPads();
    }
}

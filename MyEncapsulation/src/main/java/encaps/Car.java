package encaps;

public class Car extends Vehicle implements Drivable{
    @Override
    void move() {
        System.out.println("Car is driving.");
    }

    @Override
    public void drive() {
        System.out.println(this.getClass().getSimpleName() + " is being driven!");

    }

    @Override
    public void getSpeed() {

    }
}

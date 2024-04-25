package encaps;

public class Aeroplane extends Vehicle implements Flyable,Drivable{
    @Override
    void move() {
        System.out.println("Aeroplane is flying.");
    }
    @Override
    public void fly() {
        System.out.println("Aeroplane is Flying");
    }
    @Override
    public void drive() {

    }
    @Override
    public void getSpeed() {

    }
}

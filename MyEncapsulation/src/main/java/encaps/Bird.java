package encaps;

public abstract class Bird extends Animal implements Flyable{

    @Override
    void makeSound() {

    }
    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying!");
    }
}

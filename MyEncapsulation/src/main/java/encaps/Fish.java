package encaps;

public class Fish extends Animal implements Swimmable{

    @Override
    void makeSound() {

    }

    @Override
    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " is swimming!");
    }

    @Override
    public void getSpeed() {

    }
}

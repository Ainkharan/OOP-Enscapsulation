package encaps;

public class Duck extends Bird implements Swimmable,Flyable{

    @Override
    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " is Swimming");
    }

    @Override
    public void getSpeed() {

    }
}

package encaps;

public class Water extends Environment<Swimmable>{
    @Override
    public void checkTraffic() {
        for (Swimmable swimmable : traffic) {
            System.out.println(swimmable.getClass().getSimpleName() + " is Swimming");
        }
    }

    @Override
    public void checkVehicles() {

    }
}

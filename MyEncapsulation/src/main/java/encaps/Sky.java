package encaps;

public class Sky extends Environment<Flyable> {
    @Override
    public void checkTraffic() {
        for (Flyable flayable : traffic) {
            System.out.println(flayable.getClass().getSimpleName() + " is Flying");
        }
    }

    @Override
    public void checkVehicles() {
        for (Flyable drivable : traffic) {
            if (drivable instanceof Vehicle) {
                System.out.println(drivable.getClass().getSimpleName() + " is being Flying");
            }
        }
    }
}

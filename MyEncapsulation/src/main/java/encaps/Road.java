package encaps;

public class Road extends Environment<Drivable>{


    @Override
    public void checkTraffic() {
            for (Drivable drivable : traffic ){
                System.out.println(drivable.getClass().getSimpleName()+ " is being Driven");
            }
           // maxSpeed
    }
    @Override
    public void checkVehicles() {
        for (Drivable drivable : traffic ){
            if(drivable instanceof Vehicle ){
                System.out.println(drivable.getClass().getSimpleName()+ " is being Driven");
            }

        }

    }
}

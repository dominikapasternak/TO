import java.util.HashMap;
import java.util.Map;
public class CarFactory {
    private static Map<String, CarShowroom> flyweights = new HashMap<>();

    public static CarShowroom getCarShowroom(String key) {
        if(flyweights.containsKey(key)){
            return flyweights.get(key);
        }
        CarShowroom carShowroom;

        switch (key)
        {
            case "Midget":
                carShowroom = new CheapCar();
                carShowroom.name="Cheap Car";
                carShowroom.speed=140;
                carShowroom.horsePower=400;
                break;
            case "Sprint":
                carShowroom = new ExpensiveCar();
                carShowroom.name="Expensive Car";
                carShowroom.speed=160;
                carShowroom.horsePower=1000;
                break;
            default:
                throw new IllegalArgumentException("Unknow car type.");
        }
        flyweights.put(key, carShowroom);
        return carShowroom;
    }
}



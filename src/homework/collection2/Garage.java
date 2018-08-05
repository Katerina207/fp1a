package homework.collection2;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private Car audiA4 = new Audi("A4", 1995, "gas", "manual", "black");
    private Car audiR8 = new Audi("R8", 2018, "gas", "automatic", "yellow");
    private Car fordFocus = new Ford("Focus", 2018, "gas", "manual", "white");
    private Car fordSierra = new Ford("Sierra", 1985, "diesel", "manual", "silver");
    private Car mercedesE220 = new Mercedes("E220", 2000, "diesel", "automatic", "red");
    private Car mercedesSL500 = new Mercedes("SL500", 2018, "gas", "automatic", "blue");
    private Car volkswagenTouareg = new Volkswagen("Touareg", 2016, "gas", "automatic", "black");
    private Car volkswagenTouran = new Volkswagen("Touran", 2013, "diesel", "manual", "grey");
    private Map<Car, Integer> garage = new HashMap<>();

    public void inGarage() {
        garage.put(audiA4, 3);
        garage.put(audiR8, 1);
        garage.put(fordFocus, 3);
        garage.put(fordSierra, 4);
        garage.put(mercedesE220, 5);
        garage.put(mercedesSL500, 2);
        garage.put(volkswagenTouareg, 4);
        garage.put(volkswagenTouran, 3);
    }

    public void parking(Car newCar) {
        if (garage.containsKey(newCar)) {
            garage.replace(newCar, garage.get(newCar), garage.get(newCar) + 1);
        } else {
            garage.putIfAbsent(newCar, 1);
        }
    }

    public void leaveGarage(Car car) {
        garage.replace(car, garage.get(car), garage.get(car) - 1);
    }

    public int findNumberOfCars(Car car) {
        return garage.get(car);
    }

    public Car getAudiA4() {
        return audiA4;
    }

    public Car getAudiR8() {
        return audiR8;
    }

    public Car getFordFocus() {
        return fordFocus;
    }

    public Car getFordSierra() {
        return fordSierra;
    }

    public Car getMercedesE220() {
        return mercedesE220;
    }

    public Car getMercedesSL500() {
        return mercedesSL500;
    }

    public Car getVolkswagenTouareg() {
        return volkswagenTouareg;
    }

    public Car getVolkswagenTouran() {
        return volkswagenTouran;
    }

    public Map<Car, Integer> getGarage() {
        return garage;
    }

    @Override
    public String toString() {
        return garage.entrySet().toString();
    }
}
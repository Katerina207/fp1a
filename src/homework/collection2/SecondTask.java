package homework.collection2;

public class SecondTask {

    public static void main(String[] args) {

        Garage garage = new Garage();
        garage.inGarage();
        System.out.println(garage);

        Car audiA4 = new Audi("A4", 1995, "gas", "manual", "black");
        garage.parking(audiA4);
        System.out.println(garage);

        Car audiA8 = new Audi("A8", 2003, "gas", "automatic", "black");
        garage.parking(audiA8);
        System.out.println(garage);

        garage.leaveGarage(garage.getVolkswagenTouareg());
        System.out.println(garage);

        int numberMercedesE220 = garage.findNumberOfCars(garage.getMercedesE220());
        System.out.println(numberMercedesE220);
    }
}
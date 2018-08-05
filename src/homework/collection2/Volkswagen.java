package homework.collection2;

public class Volkswagen extends Car {

    public Volkswagen(String model, int year, String engineType, String transmission, String color) {
        super("Volkswagen", model, year, engineType, transmission, color);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
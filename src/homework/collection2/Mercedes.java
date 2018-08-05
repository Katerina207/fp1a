package homework.collection2;

public class Mercedes extends Car {

    public Mercedes(String model, int year, String engineType, String transmission, String color) {
        super("Mercedes", model, year, engineType, transmission, color);
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
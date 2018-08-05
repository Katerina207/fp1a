package homework.collection2;

public abstract class Car {

    private String brand;
    private String model;
    private int year;
    private String engineType;
    private String transmission;
    private String color;

    public Car(String brand, String model, int year, String engineType, String transmission, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineType = engineType;
        this.transmission = transmission;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        final int simple = 31;
        int result = 1;
        result = simple * result + brand.hashCode();
        result = simple * result + model.hashCode();
        result = simple * result + year;
        result = simple * result + engineType.hashCode();
        result = simple * result + transmission.hashCode();
        result = simple * result + color.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public String toString() {
        return brand + ", " + model;
    }
}
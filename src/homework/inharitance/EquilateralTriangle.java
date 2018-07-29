package homework.inharitance;

public class EquilateralTriangle extends Triangle {

    private final String name = "Равносторонний треугольник";
    private Line side;

    public EquilateralTriangle(Line side) {
        super(side, side, side);
        this.side = side;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double findArea() {
        double a = side.lineLength();
        return (a * a * Math.sqrt(3)) / 4;
    }

    @Override
    public double findPerimeter() {
        return (side.lineLength() * 3);
    }

    @Override
    public String toString() {
        return ("Равносторонний треугольник со стороной " + side.lineLength());
    }
}

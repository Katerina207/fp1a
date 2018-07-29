package homework.inharitance;

public class IsoscelesTriangle extends Triangle {

    private final String name = "Равнобедренный треугольник";
    private Line side;
    private Line baseSide;

    public IsoscelesTriangle(Line side, Line baseSide) {
        super(side, side, baseSide);
        this.side = side;
        this.baseSide = baseSide;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double findArea() {
        return baseSide.lineLength() / 2 * findHeight();
    }

    @Override
    public double findPerimeter() {
        return (side.lineLength() * 2 + baseSide.lineLength());
    }

    @Override
    public String toString() {
        return ("Равнобедренный треугольник с равными сторонами " + side.lineLength() + " и основанием " + baseSide.lineLength());
    }

    private double findHeight() {
        double a = baseSide.lineLength();
        double b = side.lineLength();
        return Math.sqrt((b * b) - ((a / 2) * (a / 2)));
    }
}

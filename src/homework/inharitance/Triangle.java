package homework.inharitance;

public class Triangle implements Shape {

    private final String name = "Треугольник";
    private Line firstSide;
    private Line secondSide;
    private Line thirdSide;

    public Triangle(Line firstSide, Line secondSide, Line thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double findArea() {
        double p = halfPerimeter();
        double a = p - firstSide.lineLength();
        double b = p - secondSide.lineLength();
        double c = p - thirdSide.lineLength();
        return Math.sqrt(p * a * b * c);
    }

    @Override
    public double findPerimeter() {
        return (firstSide.lineLength() + secondSide.lineLength() + thirdSide.lineLength());
    }

    @Override
    public String toString() {
        return ("Треугольник со сторонами " + firstSide.lineLength() + ", " + secondSide.lineLength() + ", " + thirdSide.lineLength());
    }

    private double halfPerimeter() {
        return (findPerimeter() / 2);
    }
}

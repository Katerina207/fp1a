package homework.inharitance;

public class Rectangle implements Shape {

    private final String name = "Прямоугольник";
    private Line horisontalSide;
    private Line verticalSide;

    public Rectangle(Line horisontalSide, Line verticalSide) {
        this.horisontalSide = horisontalSide;
        this.verticalSide = verticalSide;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double findArea() {
        return (horisontalSide.lineLength() * verticalSide.lineLength());
    }

    @Override
    public double findPerimeter() {
        return (horisontalSide.lineLength() * 2 + verticalSide.lineLength() * 2);
    }

    @Override
    public String toString() {
        return ("Прямоугольник со сторонами " + horisontalSide.lineLength() + ", " + verticalSide.lineLength());
    }

    public double findDiagonal() {
        return Math.sqrt(Math.pow(horisontalSide.lineLength(), 2.0) + Math.pow(verticalSide.lineLength(), 2.0));
    }
}

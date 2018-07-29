package homework.inharitance;

public class Square extends Rectangle {

    private final String name = "Прямоугольник/Квадрат";
    private Line side;

    public Square(Line side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double findArea() {
        return (side.lineLength() * side.lineLength());
    }

    @Override
    public double findPerimeter() {
        return (side.lineLength() * 4);
    }

    @Override
    public double findDiagonal() {
        return Math.sqrt(Math.pow(side.lineLength(), 2.0) * 2);
    }

    @Override
    public String toString() {
        return ("Квадрат со стороной " + side.lineLength());
    }
}


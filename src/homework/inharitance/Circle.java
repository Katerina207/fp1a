package homework.inharitance;

public class Circle implements Shape {

    private final String name = "Круг";
    private Point center;
    private Point circlePoint;

    public Circle(Point center, Point circlePoint) {
        this.center = center;
        this.circlePoint = circlePoint;
    }

    @Override
    public double findArea() {
        double r = findRadius();
        return (Math.PI * r * r);
    }

    @Override
    public double findPerimeter() {
        return (2 * Math.PI * findRadius());
    }

    @Override
    public String toString() {
        return ("Круг с центром в точке " + center.toString() + " и радиусом " + findRadius());
    }

    @Override
    public String getName() {
        return name;
    }

    private double findRadius() {

        return center.distance(circlePoint);
    }
}

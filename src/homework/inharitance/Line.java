package homework.inharitance;

public class Line {

    private final String name = "Отрезок";
    private Point startPoint;
    private Point finalPoint;

    public Line(Point startPoint, Point finalPoint) {
        this.startPoint = startPoint;
        this.finalPoint = finalPoint;
    }

    public String getName() {
        return name;
    }

    public double lineLength() {
        double length;
        if (startPoint.getX() == finalPoint.getX()) {
            length = Math.abs(startPoint.getY() - finalPoint.getY());
        } else if (startPoint.getY() == finalPoint.getY()) {
            length = Math.abs(startPoint.getX() - finalPoint.getX());
        } else {
            length = startPoint.distance(finalPoint);
        }
        return length;
    }

    @Override
    public String toString() {
        return ("Отрезок длиной " + lineLength());
    }
}

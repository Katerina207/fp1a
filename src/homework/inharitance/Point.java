package homework.inharitance;

public class Point {

    private final String name = "Точка";
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double distance(Point anotherPoint) {
        double xPoint = this.x;
        double xAnotherPoint = anotherPoint.x;
        double yPoint = this.y;
        double yAnotherPoint = anotherPoint.y;

        return Math.sqrt(Math.pow(xPoint - xAnotherPoint, 2.0) + Math.pow(yPoint - yAnotherPoint, 2.0));
    }

    @Override
    public String toString() {
        return ("(" + x + ";" + y + ")");
    }

}

package homework.oop;

public class Point {

    private double x;
    private double y;

    public Point(){
    }

    public Point(double x, double y){
      this.x = x;
      this.y = y;
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

    public double distance(){
        double x = this.x;
        double y = this.y;
        if (this.x < 0){
            x = this.x * (-1);
        }
        if (this.y < 0){
            y = this.y * (-1);
        }
        return Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
    }
}

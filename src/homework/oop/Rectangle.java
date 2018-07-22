package homework.oop;

public class Rectangle {

    private Point leftUpAngle;
    private Point rightDownAngle;

    public Rectangle(Point leftUpAngle, Point rightDownAngle){
        this.leftUpAngle = leftUpAngle;
        this.rightDownAngle = rightDownAngle;
    }

    public double area(){
        return (leftUpAngle.getX() - rightDownAngle.getX()) * (rightDownAngle.getY() - leftUpAngle.getY());
    }

    public double diagonal(){
        return Math.sqrt(Math.pow((leftUpAngle.getX() - rightDownAngle.getX()), 2.0) + Math.pow(rightDownAngle.getY() - leftUpAngle.getY(), 2.0));
    }
}

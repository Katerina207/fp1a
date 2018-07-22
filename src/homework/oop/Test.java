package homework.oop;

public class Test {

    public static void main(String[] args) {

        Point pointFirst = new Point(-3.0, 1.0);
        Point pointSecond = new Point();
        pointSecond.setX(2.0);
        pointSecond.setY(-3.0);

        System.out.println("Расстояние до первой точки: " + pointFirst.distance());
        System.out.println("Расстояние до второй точки: " + pointSecond.distance());

        System.out.println();

        Rectangle rectangle = new Rectangle(pointFirst, pointSecond);

        System.out.println("Площадь прямоугольника = " + rectangle.area());
        System.out.println("Длина диагонали прямоугольника = " + rectangle.diagonal());

    }
}

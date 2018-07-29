package homework.inharitance;

public class Test {

    public static void main(String[] args) {

        Point firstPointRectangle = new Point(1, 3);
        Point secondPointRectangle = new Point(1, 1);
        Point thirdPointRectangle = new Point(3, 1);

        Line firstLineRectangle = new Line(firstPointRectangle, secondPointRectangle);
        Line secondLineRectangle = new Line(secondPointRectangle, thirdPointRectangle);
        System.out.println(secondLineRectangle.toString());

        Rectangle rectangle = new Rectangle(firstLineRectangle, secondLineRectangle);
        System.out.println(rectangle.toString());
        System.out.println("Площадь = " + rectangle.findArea());
        System.out.println("Периметр = " + rectangle.findPerimeter());
        System.out.println("Диагональ = " + rectangle.findDiagonal());
        System.out.println();

        Square square = new Square(firstLineRectangle);
        System.out.println(square.toString());
        System.out.println("Площадь = " + square.findArea());
        System.out.println("Периметр = " + square.findPerimeter());
        System.out.println("Диагональ = " + square.findDiagonal());

        System.out.println();

        Point firstPointTriangle = new Point(0, 0);
        Point secondPointTriangle = new Point(10, 0);
        Point thirdPointTriangle = new Point(5, 8.660254037844385);

        Line firstLineTriangle = new Line(firstPointTriangle, secondPointTriangle);
        Line secondLineTriangle = new Line(secondPointTriangle, thirdPointTriangle);
        Line thirdLineTriangle = new Line(thirdPointTriangle, firstPointTriangle);

        Triangle triangle = new Triangle(firstLineTriangle, secondLineTriangle, thirdLineTriangle);
        System.out.println(triangle.toString());
        System.out.println("Площадь = " + triangle.findArea());
        System.out.println("Периметр = " + triangle.findPerimeter());
        System.out.println();

        Triangle equilateralTriangle = new EquilateralTriangle(firstLineTriangle);
        System.out.println(equilateralTriangle.toString());
        System.out.println("Площадь = " + equilateralTriangle.findArea());
        System.out.println("Периметр = " + equilateralTriangle.findPerimeter());
        System.out.println();

        Triangle isoscelesTriangle = new IsoscelesTriangle(firstLineTriangle, secondLineTriangle);
        System.out.println(isoscelesTriangle.toString());
        System.out.println("Площадь = " + isoscelesTriangle.findArea());
        System.out.println("Периметр = " + isoscelesTriangle.findPerimeter());

        System.out.println();

        Point firstPointCircle = new Point(1, 1);
        Point secondPointCircle = new Point(-3, -3);

        Circle circle = new Circle(firstPointCircle, secondPointCircle);
        System.out.println(circle.toString());
        System.out.println("Длина окружности = " + circle.findPerimeter());
        System.out.println("Площадь = " + circle.findArea());

        System.out.println();
        ShapeUtils.whichShape(square);
        ShapeUtils.whichShape(isoscelesTriangle);
        ShapeUtils.whichShape(circle);

    }
}

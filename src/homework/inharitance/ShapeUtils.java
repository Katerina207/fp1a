package homework.inharitance;

public class ShapeUtils {

    private static String rectangle = "прямоугольник";
    private static String triangle = "треугольник";
    private static String circle = "круг";

    public static void whichShape(Shape shape) {
        String result = "";
        String name = shape.getName().toLowerCase();
        if (name.contains(rectangle)) {
            result = "Фигура является прямоугольником";
        } else if (name.contains(triangle)) {
            result = "Фигура является треугольником";
        } else if (name.contains(circle)) {
            result = "Фигура является кругом";
        }
        System.out.println(result);
    }
}

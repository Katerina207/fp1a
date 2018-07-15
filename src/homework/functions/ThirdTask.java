package homework.functions;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коэффициент a:");
        double a = scanner.nextDouble();

        System.out.println("Введите коэффициент b:");
        double b = scanner.nextDouble();

        System.out.println("Введите коэффициент c:");
        double c = scanner.nextDouble();

        double d = discriminant(a, b, c);
        double x1 = 0;
        double x2 = 0;

        if (isZero(a)){
            System.out.println("Не является квадратным уравнением.");
        } else if (isZero(d)){
            System.out.println("Уравнение имеет один корень.");
            x1 = (b * (-1))/(2 * a);
            System.out.println("x = " + x1);
        } else if (isPositive(d)){
            System.out.println("Уравнение имеет два корня.");
            x1 = (b * (-1) + Math.sqrt(d)) / (2 * a);
            x2 = (b * (-1) - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + "; x2 = " + x2);
        } else {
            System.out.println("Нет действительных корней.");
        }

    }

    public static double discriminant(double a, double b, double c) {
        return (b * b - 4 * a *c);
    }

    public static boolean isPositive(double value){
        if (value > 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isZero(double value){
        if (value == 0){
            return true;
        } else {
            return false;
        }
    }
}

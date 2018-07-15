package homework.functions;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Введите размер стороны a первого дома:");
       int a = scanner.nextInt();

       System.out.println("Введите размер стороны b первого дома:");
       int b = scanner.nextInt();

       System.out.println("Введите размер стороны c второго дома:");
       int c = scanner.nextInt();

       System.out.println("Введите размер стороны d второго дома:");
       int d = scanner.nextInt();

       System.out.println("Введите размер стороны e участка :");
       int e = scanner.nextInt();

       System.out.println("Введите размер стороны f участка :");
       int f = scanner.nextInt();

       if (result(a, b, c, d, e, f)) {
           System.out.println("Эти дома помещаются на участке.");
       } else {
           System.out.println("Эти дома не помещаются на участке.");
       }
    }

    public static boolean result(int a, int b, int c, int d, int e, int f) {
        int max1 = maxLength(a, c);
        int max2 = maxLength(b, d);
        int max3 = maxLength(a, d);
        int max4 = maxLength(b, c);
        int sum1 = b + d;
        int sum2 = a + c;
        int sum3 = b + c;
        int sum4 = a + d;

        if (max1 <= e && sum1 <= f) {
            return true;
        } else if (max2 <= e && sum2 <= f) {
            return true;
        } else if (max3 <= e && sum3 <= f) {
            return true;
        } else if (max4 <= e && sum4 <= f) {
            return true;
        } else {
            return false;
        }
    }

    public static int maxLength(int length1, int length2) {
        if (length1 > length2) {
            return length1;
        } else {
            return length2;
        }
    }
}

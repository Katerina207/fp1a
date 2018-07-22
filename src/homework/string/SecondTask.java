package homework.string;

import java.util.Arrays;
import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите римское число: ");
        String values = scanner.next();

        convertDigit(values);
    }

    private static void convertDigit(String values){

        char[] valuesChar = values.toCharArray();
        int[] valuesInt = new int[valuesChar.length + 1];
        valuesInt[valuesChar.length] = 0;

        for (int i = 0; i < valuesChar.length; i++) {
            switch (valuesChar[i]){
                case 'M':
                    valuesInt[i] = 1000;
                    break;
                case 'D':
                    valuesInt[i] = 500;
                    break;
                case 'C':
                    valuesInt[i] = 100;
                    break;
                case 'L':
                    valuesInt[i] = 50;
                    break;
                case 'X':
                    valuesInt[i] = 10;
                    break;
                case 'V':
                    valuesInt[i] = 5;
                    break;
                case 'I':
                    valuesInt[i] = 1;
                    break;
                default:
                    System.out.println("Введено некорректное значение!");
            }
        }

        int result = 0;
        for (int i = 0; i < valuesInt.length - 1; i++) {
            if (valuesInt[i] >= valuesInt[i + 1]){
                result += valuesInt[i];
            } else {
                result += (valuesInt[i + 1] - valuesInt[i]);
                i++;
            }
        }

        System.out.println(result);
    }
}

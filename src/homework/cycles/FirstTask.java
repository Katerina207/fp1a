package homework.cycles;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int sum = 0;

        for (int value = scanner.nextInt(); value != 0; value /= 10){
            sum += value % 10;
        }

        System.out.println("Сумма цифр введенного целого числа = " + sum);
    }
}

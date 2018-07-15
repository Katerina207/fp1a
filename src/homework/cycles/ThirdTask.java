package homework.cycles;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дней:");
        int numberOfDays = scanner.nextInt();
        int sumRainfall = 0;
        int maxRainfall = 0;

        for (int i = 1; i <= numberOfDays; i++){
            if (i == 1){
                System.out.println("Введите количество осадков в первый день:");
            } else {
                System.out.println("Ввведите количество осадков в последующий день:");
            }
            int rainfall = scanner.nextInt();

            sumRainfall += rainfall;

            if (maxRainfall < rainfall){
                maxRainfall = rainfall;
            }
        }

        int averageRainfall = sumRainfall / numberOfDays;
        System.out.println("Количество дней: " + numberOfDays);
        System.out.println("Сумма осадков за период: " + sumRainfall);
        System.out.println("Среднее количество осадков за период: " + averageRainfall);
        System.out.println("Максимальное количество дневных осадков за период: " + maxRainfall);
    }
}

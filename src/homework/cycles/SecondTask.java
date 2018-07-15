package homework.cycles;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int value = scanner.nextInt();

        int currentFibonacci = 0;
        int nextFibonacci = 1;
        int resultFibonacci = 0;

        while (resultFibonacci < value){
            System.out.print(resultFibonacci + "; ");
            resultFibonacci = currentFibonacci + nextFibonacci;
            nextFibonacci = currentFibonacci;
            currentFibonacci = resultFibonacci;
        }
    }
}

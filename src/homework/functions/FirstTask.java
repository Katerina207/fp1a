package homework.functions;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день:");
        int day = scanner.nextInt();

        System.out.println("Введите месяц:");
        int month = scanner.nextInt();

        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isDateValid(day,month,year)) {
            System.out.print("Дата следующего дня: ");
            nextDate(day, month, year);
        } else {
            System.out.println("Дата введена некорректно!");
        }
    }

    public static void nextDate(int day, int month, int year) {
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31){
                    nextDay = 1;
                    nextMonth = ++month;
                } else {
                    nextDay = ++day;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30){
                    nextDay = 1;
                    nextMonth = ++month;
                } else {
                    nextDay = ++day;
                }
                break;
            case 2:
                if (isTemporal(year)) {
                    if (day == 29){
                        nextDay = 1;
                        nextMonth = ++month;
                    } else {
                        nextDay = ++day;
                    }
                } else {
                    if (day == 28){
                        nextDay = 1;
                        nextMonth = ++month;
                    } else {
                        nextDay = ++day;
                    }
                }
                break;
            case 12:
                if (day == 31) {
                    nextDay = 1;
                    nextMonth = 1;
                    nextYear = ++year;
                } else {
                    nextDay = ++day;
                }
                break;
        }
        System.out.println(nextDay + "." + nextMonth + "." + nextYear);
    }

    public static boolean isTemporal(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDateValid(int day, int month, int year) {
        if (day <= 0 || day > 31) {
            return false;
        }
        if (month > 12) {
            return false;
        }
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                if (day > 30) {
                    return false;
                }
                break;
            case 2:
                if (isTemporal(year)) {
                    if (day > 29) {
                        return false;
                    }
                } else {
                    if (day > 28) {
                        return false;
                    }
                }
                break;
        }
        return true;
    }
}

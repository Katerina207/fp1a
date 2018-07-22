package homework.array;

import java.util.Arrays;

public class FourthTask {

    public static void main(String[] args) {

        int[][] values = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        printArray(values);
        System.out.println(Arrays.toString(linearise(values)));
    }

    private static void printArray(int[][] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    private static int[] linearise(int[][] array){

        int [] arrayLinearized = new int[findNewLength(array)];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayLinearized[index] = array[i][j];
                index++;
            }
        }
        return arrayLinearized;
    }

    private static int findNewLength(int[][] array) {

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                counter++;
            }
        }
        return counter;
    }
}

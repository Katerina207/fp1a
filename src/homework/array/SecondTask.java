package homework.array;

import java.util.Arrays;
import java.util.Random;

public class SecondTask {

    public static void main(String[] args) {

        int[] values = new int[10];
        Random randomValue = new Random();

        for (int i = 0; i < values.length; i++) {
            values[i] = randomValue.nextInt(10);
        }

        System.out.println(Arrays.toString(values));
        removeAllEqualValue(values);

    }

    private static void removeAllEqualValue(int[] array){
        
        for (int i = 0; i < array.length-1; i++) {
            int counter = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]){
                    array[j] = 0;
                    counter++;
                }
            }
            if (counter != 0){
                array[i] = 0;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}

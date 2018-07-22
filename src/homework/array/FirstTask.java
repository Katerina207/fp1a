package homework.array;

import java.util.Arrays;

public class FirstTask {

    public static void main(String[] args) {

        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(Arrays.toString(values));
        shiftElement(values);
    }

    public static void shiftElement(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int lastValue = array[array.length - 1];
            for (int j = 1; j < array.length; j++) {
                array[array.length - j] = array[array.length - (1 + j)];
            }
            array[0] = lastValue;
            System.out.println(Arrays.toString(array));
        }
    }
}

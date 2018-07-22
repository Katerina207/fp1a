package homework.array;

import java.util.Arrays;

public class ThirdTask {

    public static void main(String[] args) {

        int[] values1 = {1, 2, 3, 4, 5};
        int[] values2 = {5, 6, 7, 8, 9, 1, 2, 3};
        int[] valuesResult = new int[values1.length + values2.length];

        findValuesResult(valuesResult, values1, values2);

        System.out.println(Arrays.toString(values1));
        System.out.println(Arrays.toString(values2));
        System.out.println(Arrays.toString(valuesResult));

    }

    private static void findValuesResult(int[] valuesResult, int[] values1, int[] values2){

        int minLength = minLengthValue(values1, values2);
        int i = 0;

        for(int j = 0; j<minLength; j++) {
            valuesResult[i] = values1[j];
            valuesResult[i + 1] = values2[j];
            i += 2;
        }

        if(values1.length >values2.length){
            for (int j = minLength; j < values1.length; j++) {
                valuesResult[i] = values1[j];
                i++;
            }
        } else {
            for (int j = minLength; j < values2.length; j++) {
                valuesResult[i] = values2[j];
                i++;
            }
        }

    }

    private static int minLengthValue (int[] array1, int[] array2){

        int result = 0;

        if (array1.length < array2.length){
            result = array1.length;
        } else {
            result = array2.length;
        }
        return result;
    }

}

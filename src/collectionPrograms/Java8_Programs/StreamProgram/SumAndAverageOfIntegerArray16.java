package collectionPrograms.Java8_Programs.StreamProgram;

import java.util.Arrays;

public class SumAndAverageOfIntegerArray16 {
    public static void main(String[] args) {

        int [] arr = {12,13,4,5,8,6,19,1,2};

       int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

       double average = Arrays.stream(arr).average().getAsDouble();//getAsDouble() is called to retrieve
        // the average value as a primitive double, which is then stored in the variable average.
        System.out.println(average);
    }
}

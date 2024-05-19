package StreamPracticeProgram;

import java.util.Arrays;

public class SumAndAverageOfArray {
    public static void main(String[] args) {

        int [] arr = {10,12,23,24,25,87,56,95};

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        //average

        double average = Arrays.stream(arr).average().getAsDouble();
        System.out.println(average);


    }
}

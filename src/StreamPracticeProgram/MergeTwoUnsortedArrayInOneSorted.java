package StreamPracticeProgram;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArrayInOneSorted {
    public static void main(String[] args) {

        int [] arr1 = {3,2,4,7,5};
        int [] arr2 = {9,7,4,3,8};

        int [] arr3 = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).distinct().sorted().toArray();
        System.out.println(Arrays.toString(arr3));


    }
}

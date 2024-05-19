package collectionPrograms.Java8_Programs.StreamProgram;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrayInOne9 {
    public static void main(String[] args) {

        int [] arr1 ={11,3,5,1,7};
        int [] arr2 ={2,4,6,8,9,10};
        int [] arr3 = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();
        System.out.println(Arrays.toString(arr3));

    }
}

package collectionPrograms.Java8_Programs.StreamProgram;

//10) How do you merge two unsorted arrays into single sorted array without duplicates?

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoUnsortedArraysIntoOneSortedWithoutDuplicate {
    public static void main(String[] args) {

        int [] arr1 ={11,3,5,1,7};
        int [] arr2 ={2,1,5,8,9,7};


//        int [] arr3 = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().distinct().toArray();
//        System.out.println(Arrays.toString(arr3));

        //merge array in one array and find square all element   
        int [] arr3 = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().map(s->s*s).toArray();
        System.out.println(Arrays.toString(arr3));
    }
}

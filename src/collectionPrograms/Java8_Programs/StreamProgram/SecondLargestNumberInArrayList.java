package collectionPrograms.Java8_Programs.StreamProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumberInArrayList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,8,9,4,3,6,2,7,1,11,23,14,35,6);


   int secondLargest =  list.stream().sorted(Comparator.reverseOrder()).skip(1). findFirst().get();
        System.out.println(secondLargest);

    }
}

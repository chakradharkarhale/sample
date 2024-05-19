package collectionPrograms.Java8_Programs.StreamProgram;

//7) From the given list of integers, print the numbers which are multiples of 5?

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNumberWhichMultiply7 {
    public static void main(String[] args) {

        List<Integer> list = List.of(45, 12, 56, 15, 24, 75, 31, 89);
        list.stream().filter(i ->i% 5==0 ).forEach(System.out::println);


        //print list in ascending order
        List<Integer> abc = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(abc);

        //print 56 number only
        int a = list.stream().sorted(Comparator.naturalOrder()).skip(5).findFirst().get();
        System.out.println(a);


    }
}

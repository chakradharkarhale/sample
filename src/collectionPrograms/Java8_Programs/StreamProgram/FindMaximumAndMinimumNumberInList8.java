package collectionPrograms.Java8_Programs.StreamProgram;

import java.util.Comparator;
import java.util.List;

//8) Given a list of integers, find maximum and minimum of those numbers?
public class FindMaximumAndMinimumNumberInList8 {
    public static void main(String[] args) {

        List<Integer> list = List.of(45, 12, 56, 15, 24, 75, 31, 89);
       int max= list.stream().max(Comparator.naturalOrder()).get();
        System.out.println("max number in list: "+max);

        int min= list.stream().min(Comparator.naturalOrder()).get();
        System.out.println("min number in list: "+min);
    }
}

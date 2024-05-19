package StreamPracticeProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNumMultiplyBy5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

     List<Integer> multiply=   list.stream().filter(i->i%5==0).collect(Collectors.toList());
        System.out.println(multiply);







    }
}

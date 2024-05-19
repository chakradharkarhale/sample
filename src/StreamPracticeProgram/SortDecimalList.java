package StreamPracticeProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//5) How do you sort the given list of decimals in reverse order?
public class SortDecimalList {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}

package StreamPracticeProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMaxAndThreeMin {
    public static void main(String[] args) {

        List<Integer>list = Arrays.asList(9,8,1,4,7,5,6,10,12,23,45,78,93,56);

        list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        //list.
    }
}

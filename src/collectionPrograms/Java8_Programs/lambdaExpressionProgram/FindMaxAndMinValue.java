package collectionPrograms.Java8_Programs.lambdaExpressionProgram;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMinValue {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11,12,23,4,5,6,7,8,9,10);

      int max=  list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);

        int min = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);

    }
}


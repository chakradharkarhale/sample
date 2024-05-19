package collectionPrograms.Java8_Programs.StreamProgram;

import java.util.Arrays;
import java.util.List;

public class CommonElementBetweenTwoArrays17 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2,4,6,8,3,5,9);
        List<Integer> list2 = Arrays.asList(1,2,3,4,11,22,33);


        list1.stream().filter(s->list2.contains(s)).forEach(System.out::println);
       // list1.stream().filter(list2::contains).forEach(System.out::println);
    }
}

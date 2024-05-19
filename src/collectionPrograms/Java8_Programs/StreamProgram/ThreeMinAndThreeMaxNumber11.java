package collectionPrograms.Java8_Programs.StreamProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMinAndThreeMaxNumber11 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,83,90,8,1,3,25,12,11,0,56,19);

        System.out.println("minimum number");
     list.stream().sorted().limit(3).forEach(System.out::println);

        System.out.println("Maximum number");
     list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}

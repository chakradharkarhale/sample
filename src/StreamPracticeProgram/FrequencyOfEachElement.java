package StreamPracticeProgram;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElement {
    public static void main(String[] args) {

        String str = "java concept of the day";

       Map<Character,Long> map = str.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

    }
}

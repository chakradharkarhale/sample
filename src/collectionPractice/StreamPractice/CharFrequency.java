package collectionPractice.StreamPractice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "java concept od the day";

        Map<Character ,Long > map = str.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}

package collectionPractice.StreamPractice;

import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<String> list = List.of("A","B","C","D","A","B");
        List<String> unique = list.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);
    }
}

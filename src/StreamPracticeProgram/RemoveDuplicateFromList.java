package StreamPracticeProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("white", "blue", "black","white","blue","green");

     List<String> duplicate=   list.stream().distinct().collect(Collectors.toList());
        System.out.println(duplicate);
    }
}

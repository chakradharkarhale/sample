package collectionPrograms.Java8_Programs.StreamMethodProgram;


//method to extract the first 3 characters of a string in Java.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodExample {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("white","red","blue","green","yellow");

//     List<String> lst =   list.stream().map(s->s.substring(0,2)).collect(Collectors.toList());
//        System.out.println(lst);
//

        List<Integer> lst = list.stream().map(s -> s.length()).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(lst);
    }
}

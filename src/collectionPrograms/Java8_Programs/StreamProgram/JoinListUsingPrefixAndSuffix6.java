package collectionPrograms.Java8_Programs.StreamProgram;

import java.util.List;
import java.util.stream.Collectors;

public class JoinListUsingPrefixAndSuffix6 {
    public static void main(String[] args) {

        List<String> list =List.of("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        //Collectors.joining() method in Java is used to concatenate the elements of a stream into a single string.
        list.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(list);
    }
}

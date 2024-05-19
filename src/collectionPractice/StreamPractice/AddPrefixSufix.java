package collectionPractice.StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddPrefixSufix {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        listOfStrings.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(listOfStrings);
    }
}

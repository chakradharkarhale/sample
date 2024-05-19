package collectionPrograms.Java8_Programs.StreamMethodProgram;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("White", "Red", "Green","Blue");
        boolean b = list.stream().anyMatch(s -> Character.isUpperCase(s.charAt(0)));
        System.out.println(b);



    }
}

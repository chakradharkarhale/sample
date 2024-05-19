package collectionPrograms.Java8_Programs.StreamProgram;

import java.util.Arrays;

public class ReverseEachWordOfString18 {
    public static void main(String[] args) {

        String str = "java concept of the day";

        Arrays.stream(str.split(" "));
    }
}

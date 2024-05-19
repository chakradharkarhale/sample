package collectionPrograms.Java8_Programs.StreamProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringAccordingToLength15 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("white", "red","blue","Green","oliveGreen");

        list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        //both are working same
      //  list.stream().sorted(Comparator.comparing(s-> s.length())).forEach(System.out::println);




    }
}

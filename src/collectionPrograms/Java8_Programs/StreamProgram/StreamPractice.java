package collectionPrograms.Java8_Programs.StreamProgram;

import java.util.ArrayList;
import java.util.List;


public class StreamPractice {
    public static void main(String[] args) {

        //create list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);



        //print all element in list using stream
        // list.stream().forEach(System.out::println);

        //print number which is greater than = 5;
        // list.stream().filter(i -> i>=5 ).forEach(System.out::println);

        //print unique number in list
        //list.stream().distinct().forEach(System.out::println);

        //using limit()
        //list.stream().limit(5).forEach(System.out::println);

        //skip first letters
        //list.stream().skip(4).forEach(System.out::println);


    }
}

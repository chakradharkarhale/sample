package collectionPrograms.Java8_Programs.StreamProgram;

//1) Given a list of integers, separate odd and even numbers?

import java.util.List;
import java.util.stream.Collectors;

public class SeparateOddEvenNumber1 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

       List<Integer> evenNumber = list.stream().filter(i ->i%2==0 ).collect(Collectors.toList());
        System.out.println("Even Number: "+evenNumber);

       List<Integer> oddNumber = list.stream().filter(i ->i%2!=0 ).collect(Collectors.toList());

        System.out.println("Odd Number: "+oddNumber);

    }
}

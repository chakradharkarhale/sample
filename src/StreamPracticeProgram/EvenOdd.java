package StreamPracticeProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//1) Given a list of integers, separate odd and even numbers?
public class EvenOdd {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    List<Integer> even =  list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(even);

        List<Integer> odd =  list.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(odd);
    }
}

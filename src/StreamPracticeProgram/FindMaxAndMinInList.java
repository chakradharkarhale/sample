package StreamPracticeProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxAndMinInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,90,23,13,12,14,45,46,47,88,3,49);
        int max = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);

        int min = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);


        //another way using lambda

        Optional<Integer> maximum =  list.stream().max((x,y)-> x.compareTo(y));

        System.out.println(maximum.orElse(null));

        Optional<Integer> minimum = list.stream().min((x,y)->x.compareTo(y));
        System.out.println(minimum.orElse(null));
    }
}

package collectionPrograms.Java8_Programs.lambdaExpressionProgram;

import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOdd4 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> even =list.stream().filter(i ->i%2==0).collect(Collectors.toList());
        System.out.println(even);

        List<Integer> odd =list.stream().filter(i ->i%2!=0).collect(Collectors.toList());
        System.out.println(odd);
    }
}

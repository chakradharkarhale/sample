package collectionPrograms.Java8_Programs;

import java.util.ArrayList;
import java.util.List;

public class PrintArraylistUsingLambdaExpression {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        for(Integer i:list){
//            System.out.println(i);
//        }

        list.forEach(n -> System.out.println(n));

//        list.forEach(n->{
//            if(n %2==0) System.out.println(n);
//        });

    }

}

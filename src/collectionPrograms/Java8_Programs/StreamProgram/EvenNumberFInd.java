package collectionPrograms.Java8_Programs.StreamProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFInd {
    public static void main(String[] args) {

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

        //find even number without using Stream

//        List<Integer> evenList = new ArrayList<>();
//        for (Integer i :list){
//            if(i%2==0){
//                evenList.add(i);
//
//            }
//        }
//        System.out.println("original list: "+list);
//        System.out.println("even list: "+evenList);


        // using stream

//      Stream<Integer> stream =list.stream();
//     List<Integer> newList= stream.filter(i ->i%2==0 ).collect(Collectors.toList());
//        System.out.println(newList);

        List<Integer> newList = list.stream().filter(i ->i%2==0 ).collect(Collectors.toList());
        System.out.println(newList);

        //count number greater than 5
        List<Integer> newList1 = list.stream().filter(i->i>5).collect(Collectors.toList());
        System.out.println(newList1);


    }
}

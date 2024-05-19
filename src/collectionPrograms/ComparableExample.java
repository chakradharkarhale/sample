package collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ComparableExample  {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(8);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(6);

        System.out.println("origional list  "+list);

        Collections.sort(list);

        System.out.println("sorted list  " +list);

    }
}



package collectionPrograms.ArrayListProgramPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArrayListIntoAnother {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("White");
       // System.out.println("original list: "+list);

    List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");


        Collections.copy(list,list1);
        System.out.println(list);
        System.out.println(list1);

    }
}

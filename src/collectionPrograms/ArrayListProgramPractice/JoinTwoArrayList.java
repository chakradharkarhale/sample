package collectionPrograms.ArrayListProgramPractice;

import java.util.ArrayList;
import java.util.List;

public class JoinTwoArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("White");
        System.out.println("original list: "+list);

        List<String> list1 = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println("original list: "+list1);

        List<String> list2 = new ArrayList<>();

        list2.addAll(list);
        list2.addAll(list1);
        System.out.println("after join two list: "+list2);

    }
}

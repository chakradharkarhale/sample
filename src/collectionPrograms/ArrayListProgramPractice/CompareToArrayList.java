package collectionPrograms.ArrayListProgramPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareToArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("White");
        //System.out.println("original list: "+list);

        List<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Blue");
        list1.add("Yellow");
        list1.add("Purple");
        list1.add("White");

        List<String> list2 = new ArrayList<>();

        for(String s :list){
            list2.add(list1.contains(s) ? "yes" : "no");
        }
        System.out.println(list2);

    }
}

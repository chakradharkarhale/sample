package collectionPrograms.ArrayListProgramPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("White");
        System.out.println("original list: "+list);

        Collections.reverse(list);
        System.out.println(list);
    }
}

package collectionPrograms.ArrayListProgramPractice;

import java.util.ArrayList;
import java.util.List;

public class InsertElementAtFirstPosition {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("White");

        System.out.println("original list: "+list);

        list.add(0,"Black");

        System.out.println("after added element at 0th position: "+list);

        //remove element at specified index
        list.remove(3);
        System.out.println(list);
    }
}

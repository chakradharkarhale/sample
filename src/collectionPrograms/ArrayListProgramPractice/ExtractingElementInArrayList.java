package collectionPrograms.ArrayListProgramPractice;

import java.util.ArrayList;
import java.util.List;

public class ExtractingElementInArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("White");
        System.out.println("original list: "+list);

        List<String> sub_List = list.subList(0,3);
        System.out.println(sub_List);
    }
}

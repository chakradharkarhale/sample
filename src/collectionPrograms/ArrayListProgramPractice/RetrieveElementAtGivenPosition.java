package collectionPrograms.ArrayListProgramPractice;

import java.util.ArrayList;
import java.util.List;

public class RetrieveElementAtGivenPosition {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("White");
        list.add("Black");

        System.out.println(list);

       String s = list.get(4);
        System.out.println("retrieve element: " +s);
    }
}

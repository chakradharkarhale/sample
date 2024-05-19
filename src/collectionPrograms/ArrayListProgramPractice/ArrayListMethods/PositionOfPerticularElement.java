package collectionPrograms.ArrayListProgramPractice.ArrayListMethods;

import java.util.ArrayList;
import java.util.List;

public class PositionOfPerticularElement {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("White");

        System.out.println(list.indexOf("Green"));
    }
}

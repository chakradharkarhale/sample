package collectionPrograms.LinkedListPracticeProgram;

import java.util.LinkedList;
import java.util.List;

public class AppendSpecifiedElementEndOfLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("White");
        list.add("Blue");
        list.add("Black");
        list.add("Red");
        list.add("Yellow");
        list.add("Green");

        //System.out.println(list);

        for(String s:list){
            System.out.println(s);
        }

    }
}

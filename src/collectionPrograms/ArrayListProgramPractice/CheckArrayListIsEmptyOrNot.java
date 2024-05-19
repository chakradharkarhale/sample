package collectionPrograms.ArrayListProgramPractice;

import java.util.ArrayList;
import java.util.List;

public class CheckArrayListIsEmptyOrNot {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("White");
        System.out.println("original list: "+list);
        System.out.println("checking arraylist is empty of not: "+list.isEmpty());
        list.removeAll(list);
        System.out.println("original list: "+list);
        System.out.println("checking arraylist is empty of not: "+list.isEmpty());
    }
}

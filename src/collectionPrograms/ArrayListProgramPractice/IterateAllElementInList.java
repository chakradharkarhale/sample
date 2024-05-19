package collectionPrograms.ArrayListProgramPractice;

import java.util.ArrayList;
import java.util.List;

public class IterateAllElementInList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("White");

        for( String s :list){
            System.out.println(s);
        }
    }
}

package collectionPrograms.ArrayListProgramPractice;

import java.util.ArrayList;
import java.util.List;

public class SearchElementInArrayList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("White");
        System.out.println("original list: "+list);

        if(list.contains("Blue")){
            System.out.println("found element");
        }else{
            System.out.println("not found");
        }

    }
}

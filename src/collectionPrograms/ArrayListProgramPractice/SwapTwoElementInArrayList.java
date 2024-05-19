package collectionPrograms.ArrayListProgramPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapTwoElementInArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("White");
        System.out.println("Arraylist before swapping: "+list);

        Collections.swap(list,0,2);

        System.out.println("After swap"+list);


    }
}

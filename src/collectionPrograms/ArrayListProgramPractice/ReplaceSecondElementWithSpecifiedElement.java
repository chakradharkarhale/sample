package collectionPrograms.ArrayListProgramPractice;

import java.util.ArrayList;

public class ReplaceSecondElementWithSpecifiedElement {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("White");

        System.out.println(list);

        String new_color ="Purple";
        list.set(1,new_color);

        int num =list.size();

        for (int i = 0; i <num ; i++) {
            System.out.println(list.get(i));

        }



    }
}

package collectionPrograms.ArrayListProgramPractice;

import java.util.ArrayList;
import java.util.List;

public class IncreaseCapacityOfArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("White");

        System.out.println(list);
        System.out.println(list.size());

        list.ensureCapacity(8);
        list.add("Purple");
        list.add("Maroon");
        list.add("Grey");

        System.out.println(list);
        System.out.println(list.size());
    }
}

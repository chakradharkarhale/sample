package collectionPrograms.ArrayListProgramPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List list = new ArrayList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add(101);
        list.add(2);


        System.out.println(list);
      list.remove(101);
      // list.remove(4);
        System.out.println(list);


    }
}

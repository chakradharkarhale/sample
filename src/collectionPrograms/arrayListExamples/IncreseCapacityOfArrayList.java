package collectionPrograms.arrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class IncreseCapacityOfArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        System.out.println(list.size());
      list.ensureCapacity(20);

        //Now 'list' can hold 20 elements.
    }
}




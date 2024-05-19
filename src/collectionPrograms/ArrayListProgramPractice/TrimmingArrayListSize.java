package collectionPrograms.ArrayListProgramPractice;

import java.util.ArrayList;
import java.util.List;

public class TrimmingArrayListSize {
    public static void main(String[] args) {
//trimToSize() method is used to trim the capacity of arrayList to the current size of ArrayList.
// Developers use this method to minimize the storage area of an ArrayList.

        ArrayList<String> list = new ArrayList<>();
        list.ensureCapacity(20);
        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("White");



        System.out.println("original list: "+list);
//trimToSize() method is used to trim the capacity of arrayList to the current size of ArrayList.
// Developers use this method to minimize the storage area of an ArrayList.

        list.trimToSize();
        System.out.println(list);

    }
}

package collectionPrograms.Cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorUsingArrayList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            String s= itr.next();
            System.out.println(s);
        }
       // System.out.println(list);

    }
}

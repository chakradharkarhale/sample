package collectionPrograms.Cursors;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorUsingArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        ListIterator<String> litr = list.listIterator();
        while (litr.hasNext()){
            String s = litr.next();
            if(list.equals("B")){
                litr.remove();

            }
           // System.out.println(s);
        }
        System.out.println(list);


    }
}

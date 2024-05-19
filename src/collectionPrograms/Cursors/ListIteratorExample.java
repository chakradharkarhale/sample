package collectionPrograms.Cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("pune");
        list.add("delhi");
        list.add("vrindavan");
        list.add("mathura");
        list.add("barsana");

        ListIterator<String> listitr = list.listIterator();

        System.out.println("Forward Direction Iteration:");

        while(listitr.hasNext()){
            System.out.println(listitr.next());
        }

        System.out.println("Backward Direction Iteration:");

        while (listitr.hasPrevious()){
            System.out.println(listitr.previous());
        }
    }
}

package collectionPrograms.LinkedListPracticeProgram;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterateElementStartingAtSpecifiedPosition {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("White");
        list.add("Blue");
        list.add("Black");
        list.add("Red");
        list.add("Yellow");
        list.add("Green");

        Iterator<String > itr = list.listIterator(1);
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}

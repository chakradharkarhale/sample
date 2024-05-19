package collectionPrograms.Cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {

            list.add(i);
            //  System.out.println(i);


        }
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer i = itr.next();
            if (i % 2 != 0) {
                itr.remove();

            }
        }
        System.out.println("List containing even numbers:");

        for (Integer num : list) {
            System.out.println(num);

        }
    }
}

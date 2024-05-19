package collectionPrograms.Cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("pune");
        list.add("mumbai");
        list.add("banglore");
        list.add("delhi");
        list.add("nanded");
        list.add("girgaon");
        list.add("manali");

    Iterator<String> itr = list.iterator();

    while (itr.hasNext()){
        String str = itr.next();
        itr.remove();

        System.out.println(str);
    }

    }
}

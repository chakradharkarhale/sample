package collectionPrograms;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String s = itr.next();
            list.remove("A");
        }
        System.out.println(list);

    }
}

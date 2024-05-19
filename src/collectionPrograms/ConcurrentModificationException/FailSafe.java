package collectionPrograms.ConcurrentModificationException;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailSafe {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            String str = itr.next();
            if(str.equals("D")){
                itr.remove();
            }
        }
        System.out.println(list);
    }
}

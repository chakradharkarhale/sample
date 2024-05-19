package collectionPrograms.ConcurrentModificationException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        for(String s : list){
            list.add("Z");
            System.out.println(s);
//           if(s.equals("A")){
//               list.remove(s);
//           }
    }

    }
}

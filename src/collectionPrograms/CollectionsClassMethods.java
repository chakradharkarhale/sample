package collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassMethods {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Z");
        list.add("A");
        list.add("C");
        list.add("M");
        list.add("P");
        list.add("Q"); //6 cr

        for (String s : list){ //enhanced for loop
            System.out.println(" Value is "+s);
        }
        System.out.println("After sorting");

        Collections.sort(list);

        for (String s : list){ //enhanced for loop
            System.out.println(" Value is "+s);
        }

       /* for(int i = 0; i < list.size(); i++){
            System.out.println(" Value is "+list.get(i));
        }*/

    }
}

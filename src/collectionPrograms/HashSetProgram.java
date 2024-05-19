package collectionPrograms;

import java.util.HashSet;
import java.util.Set;

public class HashSetProgram {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Red");
        set.add("Blue");
        set.add("Yellow");
        set.add("Black");

        //Removing "RED" from HashSet

        set.remove("Red");
        System.out.println(set);
    }
}

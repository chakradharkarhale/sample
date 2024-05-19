package collectionPrograms.Map_Practice;

//Write a Java program to create a set view of the mappings contained in a map.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SetViewOfMap {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();

        map.put("Black", 10);
        map.put("Blue", 8);
        map.put("Yellow", 9);
        map.put("Grey", 5);
        map.put("pink", 2);

       // System.out.println("original map"+map);

        Set set = map.entrySet();
        System.out.println("set Values"+set);


    }
}

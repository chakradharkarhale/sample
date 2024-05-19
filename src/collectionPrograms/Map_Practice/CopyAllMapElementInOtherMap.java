package collectionPrograms.Map_Practice;

import java.util.HashMap;
import java.util.Map;

//Write a Java program to copy all mappings from the specified map to another map.
public class CopyAllMapElementInOtherMap {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map1 = new HashMap<>();

        map.put("Black", 10);
        map.put("Blue", 8);
        map.put("Yellow", 9);
        map.put("Grey", 5);
        map.put("pink", 2);

        System.out.println("\nValues in first map: " + map);

        map1.put("Math",20);
        map1.put("Science",65);
        map1.put("History",10);
        map1.put("Marathi",15);

        System.out.println("\nValues in second map: " + map1);

        map1.putAll(map);

        System.out.println("after added in map1" +map1);

    }
}

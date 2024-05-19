package collectionPrograms.Map_Practice;

//Write a Java program to count the number of key-value (size) mappings in a map.

import java.util.HashMap;
import java.util.Map;

public class HashMapSize {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 1);
        map.put("Python", 2);
        map.put("C++", 3);
        map.put("C#", 7);
        map.put("Oracle", 9);
        map.put("Mysql", 10);
        System.out.println(map);

        System.out.println(map.size());
    }
}

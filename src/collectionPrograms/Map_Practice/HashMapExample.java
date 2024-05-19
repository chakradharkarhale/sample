package collectionPrograms.Map_Practice;

import java.util.HashMap;
import java.util.Map;

//Write a Java program to associate the specified value with the specified key in a HashMap.
public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Java", 1);
        map.put("Python", 2);
        map.put("C++", 3);
        map.put("C#", 7);
        map.put("Oracle", 9);
        map.put("Mysql", 10);



        for (Map.Entry x : map.entrySet()) {
            System.out.println(x.getKey()+" "+ x.getValue());

        }
    }
}



package collectionPractice.MapPrograms;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(4,"C++");
        map.put(9,"Python");
        map.put(2,"Golang");
        map.put(3,".net");

        System.out.println(map);


        System.out.println(map.get(9));

        System.out.println(map.size());

        System.out.println(map.entrySet());

        System.out.println(map.values());//returns all values present in map

        System.out.println(map.containsKey(9)); //return true or false

        System.out.println(map.keySet());//returns all key present in map

        System.out.println(map.clone());//create exact copy of map


       // System.out.println(map.replace(9,"Python","C#"));





    }
}

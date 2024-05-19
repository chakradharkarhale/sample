package collectionPrograms.MapMethods;

import java.util.HashMap;

public class PutAllMethodExample {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"White");
        map.put(2,"Red");
        map.put(3,"Blue");
        map.put(4,"Green");
        map.put(5,"Yellow");

        HashMap<Integer,String> newHashMap = new HashMap<>();
        newHashMap.putAll(map);
        System.out.println(newHashMap);

    }
}

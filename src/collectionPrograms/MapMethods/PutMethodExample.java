package collectionPrograms.MapMethods;

import java.util.HashMap;
import java.util.Map;

public class PutMethodExample {
    public static void main(String[] args) {

        Map<Integer,String> map =  new HashMap<>();
        map.put(1,"white");
        map.put(2,"Red");
        map.put(3,"Blue");
        map.put(4,"Green");
        map.put(5,"Yellow");
        System.out.println(map);

    }
}

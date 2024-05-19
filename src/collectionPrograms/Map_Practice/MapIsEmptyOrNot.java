package collectionPrograms.Map_Practice;

import java.util.HashMap;
import java.util.Map;

public class MapIsEmptyOrNot {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Black", 10);
        map.put("Blue", 8);
        map.put("Yellow", 9);
        map.put("Grey", 5);
        map.put("pink", 2);

        boolean result = map.isEmpty();
        System.out.println("map is empty: "+result);

        map.clear();

        result = map.isEmpty();
        System.out.println("map is empty: "+result);


    }
}

package collectionPrograms.Map_Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SetKeyViewInMap {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();

        map.put("Black", 10);
        map.put("Blue", 8);
        map.put("Yellow", 9);
        map.put("Grey", 5);
        map.put("pink", 2);

//        Set keySet = map.keySet();
//        System.out.println(keySet);

        System.out.println(map.keySet());

        System.out.println(map.values());


    }
}

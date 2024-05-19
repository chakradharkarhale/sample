package collectionPrograms.Map_Practice;

import java.util.HashMap;

public class ShallowCopyOfHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Black", 10);
        map.put("Blue", 8);
        map.put("Yellow", 9);
        map.put("Grey", 5);
        map.put("pink", 2);

        System.out.println("origional map"+map);

        HashMap<String,Integer> new_hashmap = new HashMap<String,Integer>();

        new_hashmap = (HashMap)map.clone();
        System.out.println("cloned map"+new_hashmap);


    }
}

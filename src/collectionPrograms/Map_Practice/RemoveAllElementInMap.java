package collectionPrograms.Map_Practice;

// Write a Java program to remove all mappings from a map.
import java.util.HashMap;
import java.util.Map;

public class RemoveAllElementInMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("Black", 10);
        map.put("Blue", 8);
        map.put("Yellow", 9);
        map.put("Grey", 5);
        map.put("pink", 2);

        System.out.println("Print map "+map);

        map.clear();
        System.out.println("after removing elements"+map);
    }
}

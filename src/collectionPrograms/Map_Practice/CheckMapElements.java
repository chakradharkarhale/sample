package collectionPrograms.Map_Practice;

//Write a Java program to test if a map contains a mapping for the specified key.
//Write a Java program to test if a map contains a mapping for the specified value

import java.util.HashMap;
import java.util.Map;

public class CheckMapElements {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Black", 10);
        map.put("Blue", 8);
        map.put("Yellow", 9);
        map.put("Grey", 5);
        map.put("pink", 2);

        System.out.println(map);
        map.containsKey("Blue");

        if(map.containsKey("Blue")){
            System.out.println("Yes -"+map.get("Blue"));
        }
        else{
            System.out.println("no");

        }
        map.containsKey("Red");

        if(map.containsKey("Red")){
            System.out.println("Yes -"+map.get("Red"));
        }
        else{
            System.out.println("no");

        }
        System.out.println("contains for value");


        map.containsValue(9);

        if(map.containsValue(9)){
            System.out.println("Yes -");
        }
        else{
            System.out.println("no");

        }

        map.containsValue(110);

        if(map.containsValue(110)){
            System.out.println("Yes -");
        }
        else{
            System.out.println("no");

        }
    }
}

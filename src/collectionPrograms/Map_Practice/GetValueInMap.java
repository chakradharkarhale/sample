package collectionPrograms.Map_Practice;

//Write a Java program to get the value of a specified key in a map.

import java.util.HashMap;
import java.util.Map;

public class GetValueInMap {
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<>();


        map.put("Black", 10);
        map.put("Blue", 8);
        map.put("Yellow", 9);
        map.put("Grey", 5);
        map.put("pink", 2);

//      Integer a = map.get("Black");
//        System.out.println(a);

        //OR

        System.out.println(map.get("Black"));
    }
}

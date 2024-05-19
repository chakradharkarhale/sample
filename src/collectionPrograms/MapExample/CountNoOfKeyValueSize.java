package collectionPrograms.MapExample;

import java.util.HashMap;

public class CountNoOfKeyValueSize {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Red");
        map.put(5,"Blue");
        map.put(4,"Green");
        map.put(9,"Violet");
        map.put(10,"Orange");
        map.put(2,"Black");

      //  System.out.println(map);
        System.out.println("size of map is: "+map.size());

        HashMap<Integer,String>map1 = new HashMap<>();
        map1.put(11,"Honda");
        map1.put(19,"Hero");
        map1.put(14,"Bullet");
        map1.put(12,"car");
        System.out.println(map1);

        map1.putAll(map);
        System.out.println(map1);






    }
}

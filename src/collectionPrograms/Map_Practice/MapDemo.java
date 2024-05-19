package collectionPrograms.Map_Practice;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap<>();

        hmap.put(5, "A");
        hmap.put(2, "z");
        hmap.put(7, "C");
        hmap.put(4, "y");
        hmap.put(10, "E");
        hmap.put(3, "F");
        hmap.put(1, "t");
        hmap.put(11, "H");

        //System.out.println(hmap);

//        Collection<String> values = hmap.values();
//        List<String> list1 = new ArrayList<>(values);
//        Collections.sort(list1);
//        System.out.println("sorted as per value: "+list1);

        Set<Integer> keySet = hmap.keySet();

        List<Integer> list = new ArrayList<>();

        Collections.sort(list);

        for(Integer i:list){
            System.out.println("sorted as per keys: "+i);

        }
        System.out.println(hmap);

    }

}

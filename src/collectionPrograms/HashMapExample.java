package collectionPrograms;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[]args){
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> map11 = new HashMap<>();

        map.put(1,"chakradhar");
        map.put(2,"Suraj");
        map.put(3,"shahaji");
        map.put(4,"rajat");
        map.put(5,"dheeraj");
        map.put(6,"shubham");

      // map.put(6,"mahesh");


        System.out.println(map.get(9));


        System.out.println(map);
        System.out.println(map.size());

        map11.put(1,"chakradhar");
        map11.put(1,"Suraj");
        map11.put(1,"shahaji");
        map11.put(1,"rajat");
        map11.put(1,"dheeraj");
        map11.put(1,"shubham");

        System.out.println(map11.size());


    }
}

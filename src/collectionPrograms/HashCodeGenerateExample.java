package collectionPrograms;

import java.util.HashMap;
import java.util.Map;

public class HashCodeGenerateExample {

    @Override
    public int hashCode() {
        return 14;
    }

    public static void main(String[] args) {
        HashCodeGenerateExample obj = new HashCodeGenerateExample();
        System.out.println(obj.hashCode()); //

        HashCodeGenerateExample obj1 = new HashCodeGenerateExample();
        System.out.println(obj1.hashCode()); //

        Map<HashCodeGenerateExample, String> map = new HashMap<>();

        map.put(obj, "Test");     //Entry
        map.put(obj1, "Java");  //Entry

        System.out.println(map.get(obj1));    //

    }
}


package collectionPrograms.arrayListExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraylistProgram {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Pineapple");
        list.add("Grapes");
        list.add("Avocado");
        list.add("Blueberry");

        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Pineapple");
        list1.add("C");
        list1.add("D");
        list1.add("E");

//        list.add(2,"Mango");
//        System.out.println(list);

//        list.remove("Mango");
//        System.out.println(list);

//        list.remove(2);
//        System.out.println(list);

 //       System.out.println(list.get(3));  //retrieve element at specified index

//        System.out.println(list.containsAll(list));

 //       System.out.println(list.contains("Blueberry"));

//        list.addFirst("Banana"); //add element at first position
//        System.out.println(list);
//
//        list.add(0,"Kiwi"); //add element at first position
//        System.out.println(list);
//
//        list.set(2,"Orange");  //update an array element by the given element.
//        System.out.println(list);
//
//        System.out.println(list.contains("Mango"));

//        if(list.contains("Mango")){
//            System.out.println("element found");
//        }
//        else{
//            System.out.println("not found");
//        }

//        Collections.sort(list);
//        System.out.println(list);

//        list.addAll(list1);
//        System.out.println(list);
//
//        Collections.copy(list,list1);
//        System.out.println(list); // copy one array list into another.

//        Collections.shuffle(list);
//        System.out.println(list);
//
//
//        System.out.println(list.subList(0,3)); //extract a portion of an array list.
//
//        ArrayList<String> list2 = new ArrayList<>();
//        for(String s :list){
//            list2.add(list1.contains(s) ? "yes": "No");
//
//        }
//        System.out.println(list2);

//        Collections.swap(list, 0,2);
//        System.out.println(list);  //swaps two elements in an array list.
//

//        ArrayList<String> list4 = (ArrayList<String>) ((ArrayList<String>) list).clone();
//        System.out.println(list4);
//
    }
}

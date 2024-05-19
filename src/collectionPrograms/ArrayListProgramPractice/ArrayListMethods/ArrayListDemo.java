package collectionPrograms.ArrayListProgramPractice.ArrayListMethods;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("White");
        list.add("Pink");
        list.add("Purple");

        System.out.println(list);

        List<String> list1 = new ArrayList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");

        System.out.println(list1);
//         list.addAll(list1);    [Red, Blue, Yellow, Green, White, Pink, Purple, A, B, C, D, E]

//        list.addAll(3,list1);   [Red, Blue, Yellow, A, B, C, D, E, Green, White, Pink, Purple]
//       System.out.println(list);
//
//        list1.removeAll(list1);
//        System.out.println(list1);//remove all element of list


//        list.remove(3);
//        System.out.println(list); Removes the element at the specified position in this list.


//        list.remove("White");
//        System.out.println(list);Removes the first occurrence of the specified element from this list, if it is present.


//        System.out.println(list.contains("White")); Returns true if this list contains the specified element.

//        System.out.println(list.containsAll(list));

 //       System.out.println(list.get(2));Returns the element at the specified position in this list.

 //       System.out.println( list.isEmpty());Returns true if this list contains no elements.

//            list.addFirst("oliveGreen");
//             System.out.println(list);

//        list.clear();
//        System.out.println(list);


 //       System.out.println(list.hashCode());







    }
}



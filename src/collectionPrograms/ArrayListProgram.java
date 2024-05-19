package collectionPrograms;
import java.util.*;
public class ArrayListProgram {
    public static void main(String[] args) {

        List al = new ArrayList();

        al.add("A");//duplicate object are allowed
        al.add("A"); //heterogeneous object insertion is possible
        al.add(13); //heterogeneous object insertion is possible
        al.add(null); //null insertion is possible
       // System.out.println(al);
       // al.remove("A");
        //System.out.println(al);
        al.add(2,"S");
        al.add("P");
        System.out.println(al);


        List<Integer> list =new  ArrayList();
       list.add(25);
        list.add(30);
        list.add(31);
        list.add(35);

       //list.clear();
       al.addAll(list);
     System.out.println(al);

    }

}

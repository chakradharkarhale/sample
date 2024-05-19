package collectionPrograms.ArrayListProgramPractice;
// Write a Java program to update an array element by the given element.
import java.util.ArrayList;
import java.util.List;

public class UpdateElementInList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("White");
        System.out.println("original list: "+list);

        String s =list.set(3,"Pink");
        System.out.println("updated list: "+list);

    }
}

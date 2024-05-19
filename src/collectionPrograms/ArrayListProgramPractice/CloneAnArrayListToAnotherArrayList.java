package collectionPrograms.ArrayListProgramPractice;

import java.util.ArrayList;
import java.util.List;

public class CloneAnArrayListToAnotherArrayList {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        System.out.println("Original array list: " + list);

        ArrayList<String> Arrlist = (ArrayList<String>)list.clone();
        System.out.println("Cloned array list: " + Arrlist);
    }
}

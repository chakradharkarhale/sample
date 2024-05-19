package collectionPrograms.Java8_Programs.StreamProgram;

//2) How do you remove duplicate elements from a list using Java 8 streams?
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElement2 {
    public static void main(String[] args) {

        List<String> list = List.of("java","python","golang","sql","javascript","python","java");

//        List<String> uniqueList = list.stream().distinct().collect(Collectors.toList());
//        System.out.println(uniqueList);
//
//        // print ascending order only unique element
//        List<String> lst =  list.stream().sorted(Comparator.naturalOrder()).distinct().collect(Collectors.toList());
//        System.out.println(lst);
//
//
//        //skip first three
//        List<String> lstr = list.stream().sorted(Comparator.naturalOrder()).distinct().skip(3).collect(Collectors.toList());
//        System.out.println(lstr);

        List<String> list2=list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(list2);
        // print javascript element

        String str1 = list.stream().sorted(Comparator.naturalOrder()).skip(4).findFirst().get();
        System.out.println(str1);


        //check golang is present or not if present return it
       list.stream().filter(s->s.contains("golang")).forEach(System.out::println);


    }
}

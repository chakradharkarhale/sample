package collectionPrograms.Java8_Programs.StreamProgram;

//4) How do you find frequency of each element in an array or a list?

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElement4 {
    public static void main(String[] args) {

        List<String> list = List.of("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Frequency of Element: "+map);



    }
}

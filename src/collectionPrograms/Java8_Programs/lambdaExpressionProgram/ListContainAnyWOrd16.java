package collectionPrograms.Java8_Programs.lambdaExpressionProgram;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListContainAnyWOrd16 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("red","white","blue","green","orange","black");

        String str = "black";

        Predicate<String> predicate = str1 ->str1.contains(str);
       boolean flag= list.stream().anyMatch(predicate);
        System.out.println(str+":-> Black color is available: "+flag );


    }
}

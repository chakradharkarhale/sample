package collectionPrograms.Java8_Programs.lambdaExpressionProgram;

//Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
import java.util.Arrays;
import java.util.List;

public class SortListOfStringsInAlphabeticalOrder5 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("White","Black","Blue","Red","Green");

        list.sort((str1, str2) -> str1.compareToIgnoreCase(str2));

        for(String str:list){
            System.out.println(str);
        }

    }
}

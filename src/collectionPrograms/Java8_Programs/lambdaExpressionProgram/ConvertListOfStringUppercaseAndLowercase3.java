package collectionPrograms.Java8_Programs.lambdaExpressionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListOfStringUppercaseAndLowercase3 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "database", "AWS", "GoLang");


        //Original list
        System.out.println("original list: ");
        for(String str :list){
            System.out.println(str);
        }

        //convert lowercase

        list.replaceAll(str->str.toLowerCase());

        System.out.println("lower case list: ");
        for( String str : list){
            System.out.println(str);
        }

        list.replaceAll(str ->str.toUpperCase());

        System.out.println("To upper case: ");
        for (String str : list){
            System.out.println(str);
        }

    }
}

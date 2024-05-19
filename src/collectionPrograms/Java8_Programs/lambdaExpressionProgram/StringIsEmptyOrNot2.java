package collectionPrograms.Java8_Programs.lambdaExpressionProgram;

import java.util.function.Predicate;

public class StringIsEmptyOrNot2 {
    public static void main(String[] args) {

        Predicate<String> predicate = str -> str.isEmpty();//Predicate is declared and initialized.
        // This Predicate takes a String as input and checks if it's empty using the isEmpty() method.
        // The str -> str.isEmpty() is a lambda expression that defines the behavior of the Predicate.
        // It takes a String argument str and returns true if the string is empty, otherwise false

        String str1 = "";
        String str2 = "java concept of the day";

        System.out.println("Is str1 empty? " + predicate.test(str1));
        System.out.println("Is str2 empty? " + predicate.test(str2));
        //test method of the Predicate interface is used to test the strings.
        // It returns true if the string is empty according to the predicate, and false otherwise.
    }
}

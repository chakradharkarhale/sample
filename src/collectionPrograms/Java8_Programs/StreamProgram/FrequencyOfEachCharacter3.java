package collectionPrograms.Java8_Programs.StreamProgram;

//3) How do you find frequency of each character in a string using Java 8 streams?

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import java.util.function.Predicate;
import java.util.stream.IntStream;


public class FrequencyOfEachCharacter3 {
    public static void main(String[] args) {

        String str = "java concept of the day";

        Map<Character,Long> map = str.chars()//Use the chars() method to convert the string into an IntStream of Unicode code points.
                .mapToObj(c -> (char) c)//Use the mapToObj() method to convert each integer code point to its corresponding character representation.
                .collect(Collectors.groupingBy(Function.identity()//Use the Collectors.groupingBy() collector to group the characters by their frequency.
                        ,Collectors.counting()));//Collectors.counting() downstream collector to count the occurrences of each character.
        System.out.println(map);//iterate through the map and print the frequency of each character.




    }
}


 class CheckPrime {
    public static void main(String[] args) {
        Predicate<Integer> isPrime = n -> n > 1 && IntStream.range(2, (int) Math.sqrt(n) + 1)
                .noneMatch(i -> n % i == 0);

        int n = 17;
        System.out.println(n + " is prime? " + isPrime.test(n));

        n = 15;
        System.out.println( n + " is prime? " + isPrime.test(n));
    }
}

//It defines a Predicate named is_Prime which takes an integer n and returns true if n is prime,
// and false otherwise.

//The lambda expression n -> n > 1 && IntStream.range(2, (int) Math.sqrt(n) + 1).noneMatch(i -> n % i == 0)
// checks whether n is greater than 1 and whether none of the numbers
// from 2 to the square root of n evenly divide n. If any number divides n evenly, it means n is not prime.


//IntStream.range(2, (int) Math.sqrt(n) + 1) generates a stream of integers from 2 to the square root of n



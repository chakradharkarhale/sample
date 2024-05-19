package collectionPrograms.Java8_Programs.lambdaExpressionProgram;

import java.util.function.BiFunction;



public class ConcatenateTwoString10 {
    public static void main(String[] args) {

        BiFunction<String,String,String> biFunction = (str1 , str2) -> str1+str2;

        String s = "Spring";
        String s1 = "Boot";

        String result = biFunction.apply(s,s1);
        System.out.println(result);

    }
}

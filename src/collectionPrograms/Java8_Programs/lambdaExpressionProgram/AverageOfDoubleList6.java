package collectionPrograms.Java8_Programs.lambdaExpressionProgram;

import java.util.Arrays;
import java.util.List;

public class AverageOfDoubleList6 {
    public static void main(String[] args) {

        List<Double>list = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);


        double average =  list.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println("Average of Above list: "+average);

        //.stream(): This method converts the list into a stream.
        //.mapToDouble(Double::doubleValue): This maps each Double object in the stream to its corresponding primitive double value.
        //.average(): This calculates the average of the elements in the stream.
        //It returns an OptionalDouble, which may or may not have a value.
        //.orElse(0.0): This provides a default value of 0.0 if the optional doesn't have a value.
        // In other words, if the list is empty, it will return 0.0.
    }
}

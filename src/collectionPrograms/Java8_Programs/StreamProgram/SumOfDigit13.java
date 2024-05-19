package collectionPrograms.Java8_Programs.StreamProgram;

public class SumOfDigit13 {
    public static void main(String[] args) {

        int num = 12345;

    int sumOfDigit=    String.valueOf(num).chars().map(c->Character.getNumericValue((char) c)).sum();
        System.out.println(sumOfDigit);
    }
}

//String.valueOf(num): This converts the integer num to a string representation.
//
//.chars(): This converts the string into an IntStream of Unicode code points.
//
//.map(c -> Character.getNumericValue((char) c)): This maps each Unicode code point to its numeric value.
// It converts each character to its corresponding numeric value using Character.getNumericValue().
//.sum(): This calculates the sum of all the numeric values in the stream.
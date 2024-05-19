package PracticeJavaProgram;

public class ReverseNumber {
    public static void main(String[] args) {

        int num =1723;
        int reversed=0;
        int digit ;

        while(num!=0){//This is a while loop that continues until the original number (num) becomes 0. Inside the loop:
            digit = num%10;//digit = num % 10;: Extracts the last digit of the original number by taking the remainder when dividing by 10.
            reversed = reversed * 10 +digit;//Appends the extracted digit to the reversed number.
            num /=10;// Removes the last digit from the original number.

        }
        System.out.println(reversed);
    }
}

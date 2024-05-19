package PracticeJavaProgram;

import java.util.Locale;
public class PalindromeString {
    public static void main(String[] args) {

        String str = "madam";
        boolean isPalindrome =true;

        for(int i=0; i<str.length()/2; i++){ /* This line starts a for loop that iterates over half of the characters in the string str.
                                              The loop variable i starts from 0 and goes up to half the length of the string*/

            if(str.charAt(i) != str.charAt(str.length()-1 -i)){/* Inside the loop,
                this line checks whether the character at position i from the beginning of the string is not equal to the
                 character at position str.length() - 1 - i from the end of the string.
                  If they are not equal, it means the string is not a palindrome.*/

                isPalindrome = false;
                        break;
            }
        }
        if(isPalindrome){
            System.out.println(str + " is a palindrome");

        }else{
            System.out.println(str +" is a not palindrome");
        }


    }
}

//another way
class PalindromeCheck{

    public static void main(String[] args) {

        String str ="Naaan";
        String str1=str.toLowerCase();
        String reverse="";

        for (int i = 0; i < str1.length(); i++) {

            reverse = str1.charAt(i) + reverse;


        }
        if(str1.equals(reverse)){
            System.out.println("is palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
package ArrayPractice;
//
//public class ReverseNumber {
//    public static void main(String[] args) {
//        int num =67593;
//        int reverse =0;
//        int digit;
//
//        while(num !=0){
//             digit = num % 10;  // Extract the last digit of the original number
//            reverse =reverse *10 +digit;//// Append the extracted digit to the reversed number,
//            // shifting the existing digits by one place to the left
//
//            num /= 10;
//
//        }
//        System.out.println("reversed number: " +reverse);
//    }
//
//
//}


public class ReverseNumber {
    public static void main(String[] args) {
        String input = "chakradhar karhale";
        String reversedStringWithoutSpaces = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) != ' ') {           //Within the loop, each character of the input string is examined.
                                                    // If the character is not a space (' '),
                                                    // it is appended to the reversedStringWithoutSpaces variable
                reversedStringWithoutSpaces += input.charAt(i);
            }
        }

        System.out.println("Reversed string without spaces: " + reversedStringWithoutSpaces);
    }
}


package ArrayPractice;

public class palindrom {
    public static void main(String[] args) {
        String str = "121";
        boolean palindrome =true;

        for (int i = 0; i <str.length()/2 ; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){

                palindrome= false;
                break;
            }

        }
        if(palindrome){
            System.out.println("Is palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}

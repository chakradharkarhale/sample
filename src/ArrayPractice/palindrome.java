package ArrayPractice;

public class palindrome {

    public static void main(String[] args) {

        String str="madam";
        boolean palindrome=true;

        for (int i = 0; i <str.length()/2 ; i++) {

            if(str.charAt(i)!= str.charAt(str.length()-1-i)){

                palindrome=false;
                break;
            }
        }

        if(palindrome){
            System.out.println("is palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }

}

package String_Prgrams;

public class ReverseStringWithoutSpaces {

    public static void main(String[] args) {
        String input ="chakradhar karhale";
        String reverseStringWithoutSpaces=" ";

        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)!=' '){
                reverseStringWithoutSpaces +=input.charAt(i);
            }
        }
        System.out.println(reverseStringWithoutSpaces);
    }
}





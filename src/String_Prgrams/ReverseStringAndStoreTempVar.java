package String_Prgrams;

public class ReverseStringAndStoreTempVar {
    public static void main(String[] args) {

        String str = "Chakradhar";
        String tempStr="";

        for (int i = str.length()-1; i >=0 ; i--) {

               tempStr += str.charAt(i);
           // System.out.println(str.charAt(i));

        }
        System.out.println(tempStr);
    }
}

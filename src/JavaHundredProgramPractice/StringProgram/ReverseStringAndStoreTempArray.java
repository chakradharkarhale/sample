package JavaHundredProgramPractice.StringProgram;

public class ReverseStringAndStoreTempArray {
    public static void main(String[] args) {

        String str = "chakradhar";

        String temp = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            temp+=str.charAt(i);

        }
        System.out.println(temp);
    }
}

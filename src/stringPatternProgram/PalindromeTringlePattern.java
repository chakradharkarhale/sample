package stringPatternProgram;
public class PalindromeTringlePattern {
    public static void main(String args[]) {
        String a = "chakradhar";
        String b = "karhale";
        System.out.println("Before swap: " + a + " " + b);
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("After : " + a + " " + b);
    }
}
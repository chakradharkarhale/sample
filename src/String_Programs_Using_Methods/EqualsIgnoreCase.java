package String_Programs_Using_Methods;

//it compares one string to another string ignoring case consideration i.e. lower or upper case
public class EqualsIgnoreCase {

    public static void main(String[] args) {

        String s1 = "Chakradhar";
        String s2 = "chakradhar";
        String s3 = "CHAkraDHAr";
        String s4 = "1234567890";

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s3.equalsIgnoreCase(s4));

    }
}

package String_Programs_Using_Methods;

public record DoubleEqualToOperator() {

    public static void main(String[] args) {

        String str1 = new String("Chakru");
        String str2 = new String("Chakru");

        String str3 = "Chakru";
        String str4 = "Chakru";

        System.out.println(str1==str2);
        System.out.println(str3==str4);



        StringBuffer sb1 = new StringBuffer("java");
        StringBuffer sb2 = new StringBuffer("java");
        System.out.println(sb1==sb2);

    }
}

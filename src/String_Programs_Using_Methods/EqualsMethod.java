package String_Programs_Using_Methods;

public class EqualsMethod {

    public static void main(String[] args) {
        String str1 = new String("GFG");
        String str2 = new String("GFG");

        System.out.println(str1.equals(str2));



    }

}

class GFG {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("GFG");
        StringBuilder sb2 = new StringBuilder("GFG");

        System.out.println(sb1.equals(sb2));



    }
}



/*The equals method is called on sb1, passing sb2 as an argument. However,
StringBuffer class does not override the equals method from the Object class,
so it performs reference equality check, not content equality check.


Since sb1 and sb2 are two distinct objects in memory (even though they hold the same content),
the equals method returns false.*/


package String_Prgrams;

public class CountSpacesInString {
    public static void main(String[] args) {
         String input ="hi world how many spaces are there";
         int SpaceCount=0;

        for (int i = 0; i <input.length(); i++) {
            if(input.charAt(i)==' ') {
                SpaceCount++;
            }

        }
        System.out.println("no of spaces in string:"+SpaceCount);
    }
}


 class Main {
    public static void main(String[] args) {
        String input = "chakradhar";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            result.append(input.charAt(i));
            if ((i + 1) % 2 == 0 && i != input.length() - 1) {
                result.append(" ");
            }
        }

        System.out.println("Result: " + result.toString());
    }
}





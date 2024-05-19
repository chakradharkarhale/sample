package String_Prgrams;

public class SpaceInEveryStringLetter {
    public static void main(String[] args) {

        String str = "chakradhar";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length() ; i++) {
            sb.append(str.charAt(i));
            if(i != str.length()-1){
                sb.append(" ");
            }

        }
        System.out.println(sb.toString());
    }
}

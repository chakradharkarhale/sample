package String_Prgrams;

public class CountCharacterValueInString {
    public static void main(String[] args) {
        String str ="Chakradhar";
        int count =0;
        char [] chArray = str.toCharArray();

        for (int i = 0; i <chArray.length ; i++) {

            if(chArray[i]=='a') {
                count++;

            }
        }
        System.out.println("count of a is : "+count);
    }

}

package String_Prgrams;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        //string variable str is initialized with the value "chakradhar".
        String str = "chakradhar";

        //An integer array arr of size 256 is created to store the frequency of each character
        int[] arr = new int[256];

        //This loop iterates through each character of the string
        for(int i=0; i<str.length() ; i++){

            arr[str.charAt(i)]++;

        }
        //This loop traverses through the entire arr array.+-
        //For each index "i" where the value is non-zero it prints the character represented by the ASCII value "i",
        // along with its frequency.
        for(int i =0; i<arr.length; i++){

            if(arr[i] !=0){

                //(char) i converts the integer ASCII value i back into its corresponding character.
                System.out.println((char) i  +"-"+ arr[i]);
            }
        }

    }

}

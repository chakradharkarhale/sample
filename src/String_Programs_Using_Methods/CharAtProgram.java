package String_Programs_Using_Methods;
//Print Characters Presented at Even Positions by Using the charAt() Method

// method returns characters at specified index.
public class CharAtProgram {

    public static void main(String[] args) {

        String s = "welcome pp  to tdit solution ";

        for(int i =0; i<=s.length() -1; i++)
        {
            if(i%2 == 0){

                System.out.print(" " +i);
              //  System.out.print(s.charAt(i));

        }


        }
    }
}

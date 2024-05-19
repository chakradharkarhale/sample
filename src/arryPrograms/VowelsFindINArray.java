package arryPrograms;

public class VowelsFindINArray {

    public static void main(String[] args) {
        int countOfVovels=0;

        String str ="chakradharkarhale";
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){

                System.out.println(str.charAt(i));
                countOfVovels++;
            }
        }
        System.out.println("count of vovels" +countOfVovels);
    }
}

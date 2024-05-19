public class StringSwap {
    public static void main(String[] args) {

        String str1 = "Test";
        String str2 = "Best";

//         String str3;
//
//         str3= str1;
//         str1 = str2;
//         str2 = str3;
//        System.out.println(str1);
//        System.out.println(str2);

        str1 = str1+str2;

        str2 = str1.substring(0,str1.length()-  str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("swaping str1:  "+str1+ "    Swapping str2:    "+ str2);


    }
}

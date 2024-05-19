package ExceptionHandling;

public class Rethrowing {
    public static void main(String[] args)  {
        try {

            riskyMethod();
        }catch (ArithmeticException e){
            System.out.println("abcd");

//        try {
//            riskyMethod();
//        } catch (ArithmeticException e) {
//            System.out.println("arithmetic");
//            try{
//                throw new NullPointerException();
//            }catch(NullPointerException npe){
//                System.out.println("npe occured");
//            }
//
        }
    }

    public static void riskyMethod() throws ArithmeticException{
        // Simulate an ArithmeticException
        int result = 5 / 0; // This will throw an ArithmeticException
    }
}

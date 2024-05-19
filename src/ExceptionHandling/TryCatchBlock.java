package ExceptionHandling;

public class TryCatchBlock {
    public static void main(String[] args) {

        int a=10;
        int b=0;

        try{
           int divide=  a/b;
            System.out.println("arithmetic exception occurs");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

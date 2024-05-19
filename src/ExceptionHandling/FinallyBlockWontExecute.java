package ExceptionHandling;

public class FinallyBlockWontExecute {
    public static void main(String[] args) {
        try{
            System.out.println("try block");
            System.exit(0);
        }catch(ArithmeticException ae){
            System.out.println("catch block");
        }
        finally {
            System.out.println("finally block");
        }
    }
}

package ExceptionHandling;

public class NullPointerException extends Throwable {
    public static void main(String[] args) {
        String str = null;

        try{
            int length =str.length();

        } catch(java.lang.NullPointerException npe){
            System.out.println(npe.getMessage());
        }

    }
}

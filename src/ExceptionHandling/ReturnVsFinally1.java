package ExceptionHandling;
//if return statement present is try, catch and finally block then finally block return statement will be considered.
public class ReturnVsFinally1 {
    public static void main(String[] args) {

        System.out.println(m1());
    }

    public static int m1() {
        try{
            System.out.println(10/0);
            return 777;
        }catch(ArithmeticException ae){
            return 888;
        }
        finally {
            return 999;
        }
    }
}

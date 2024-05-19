package ExceptionHandling;

public class Test extends Throwable {
    public static void main(String[] args) throws Test {
        throw new Test();
    }
}

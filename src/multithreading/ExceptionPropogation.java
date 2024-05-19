package multithreading;

public class ExceptionPropogation {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught in main: " + e.getMessage());
        }
    }

    public static void method1() throws ArithmeticException {
        System.out.println("Inside method1");
        // Call method2 which may throw an ArithmeticException
        method2();
    }

    public static void method2() throws ArithmeticException {
        System.out.println("Inside method2");
        // Call method3 which may throw an ArithmeticException
        method3();
    }

    public static void method3() throws ArithmeticException {
        System.out.println("Inside method3");
        // Simulate an arithmetic operation that may cause ArithmeticException
        int result = 5 / 0; // This will throw an ArithmeticException
    }
}


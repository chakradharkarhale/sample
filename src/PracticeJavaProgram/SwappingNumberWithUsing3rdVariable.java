package PracticeJavaProgram;

public class SwappingNumberWithUsing3rdVariable  {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        int temp;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        temp = a;
        a=b;
        b=temp;
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
       // System.out.println(a+ " "+b);
    }
}

package PracticeJavaProgram;

//fibonnaci series is, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
public class FibonnaciSeries {

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=10;
        int sum;

        System.out.print("Fibonacci Series: ");
        for (int i=0; i<=n;i++){
           System.out.print(" "+a);
            sum = a+b;
            a=b;
            b=sum;
        }
        }
    }




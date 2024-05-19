package PracticeJavaProgram;

public class PrimeNumber {
    public static void main(String[] args) {

int num =2;
boolean isPrime =true;

        for (int i = 2; i <=num/2 ; i++) {

            if(num %i ==0){ //Inside the loop, it checks if num is divisible by i.
                // If num is divisible by i without any remainder, it means num is not prime
                isPrime=false;
                break;
            }
        }

        if(isPrime){
            System.out.println(num +" num is prime");
        }else{
            System.out.println(num +" num is not prime");
        }
    }

}

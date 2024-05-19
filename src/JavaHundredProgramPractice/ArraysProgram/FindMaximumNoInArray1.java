package JavaHundredProgramPractice.ArraysProgram;

public class FindMaximumNoInArray1 {
    public static void main(String[] args) {

        int [] arr = {1,4,2,7,5,9};
        int max=arr[0];
        //we initialize the variable max with the first element of the array.
        // This is our initial guess for the maximum.

        for (int i = 1; i < arr.length ; i++) {

            if(arr[i]>max){
                max=arr[i];
                //arr[i], we check if it is greater than the current maximum (max).
                // If it is, we update the value of max to arr[i], thus updating our current maximum.

            }
        }
        System.out.println("maximum number of given array is: "+max);

    }
}

package arryPrograms;
////Write a Java program to calculate the average value of array elements.
//public class AverageValueInArray {
//
//    public static void main(String[] args) {
//        int[] arr ={1,2,3,4,5,6,7,8,9};
//
//        int sum =0;
//
//        for(int i=0; i<arr.length; i++){
//
//            sum += arr[i];
//
//        }
//        double avg = sum / arr.length;
//
//        System.out.println(avg);
//
//    }
//
//}


public class AverageValueInArray {
    // The main method where the p rogram execution starts.
    public static void main(String[] args) {
        // Declare an integer array 'numbers' and initialize it with values.
        int[] arr = {2, 30, 25, 35, 16, 30, 10};

        // Initialize a variable 'sum' to store the sum of array elements.
        int sum = 0;

        // Use a for loop to iterate over the elements of the 'numbers' array.
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the sum.
            sum = sum + arr[i];
        }

        // Calculate the average value by dividing the sum by the number of elements.
        double average = sum / arr.length;

        // Print the calculated average value to the console.
        System.out.println("Average value of the array elements is : " + average);
    }
}

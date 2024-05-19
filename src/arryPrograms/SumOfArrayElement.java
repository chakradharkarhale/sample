package arryPrograms;
// Java Program to find sum of elements in a given array
public class SumOfArrayElement {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int sum=0;

        // Iterate through all elements
        for(int i=0; i<arr.length; i++){

          //  and add them to sum
            sum += arr[i];


        }
        //print sum
        System.out.println(sum);
    }

}

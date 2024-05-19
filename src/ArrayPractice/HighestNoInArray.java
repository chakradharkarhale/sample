package ArrayPractice;

public class HighestNoInArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 6, 8, 19, 7};

        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j < arr.length; j++) {


                int temp = 0;

                if (arr[i] > arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
       // System.out.println(arr[arr.length-1]);// arr.length-1 means array cha last index print krto apn ithe

        System.out.println(arr[0]);//array cha first index print kela it will return lowest value if ur if(>)condition is greater than
    }}

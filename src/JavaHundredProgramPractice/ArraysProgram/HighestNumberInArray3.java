package JavaHundredProgramPractice.ArraysProgram;

public class HighestNumberInArray3 {
    public static void main(String[] args) {

        int [] arr = {1,4,5,2,8,6,9};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {

                int temp=0;

                if(arr[i] > arr[j]){

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;


                }

            }


        }
         System.out.println(arr[arr.length-1]);
    }
}

package JavaHundredProgramPractice.ArraysProgram;

public class CommonElementInTwoArray7 {
    public static void main(String[] args) {
        int[]arr={2,1,3,4,5,21,78,9};
        int[]arr1={2,5,3,10,22,19,12};

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr1.length ; j++) {
                if(arr[i]==arr1[j]){
                    System.out.println(arr[i]);
                    break;

                }

            }

        }
    }
}


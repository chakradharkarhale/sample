package JavaHundredProgramPractice.ArraysProgram;

public class CommonElementInThreeArray {
    public static void main(String[] args) {

        int [] arr1 = {1,3,5,7,9,11};
        int [] arr2 = {2,4,5,6,7,8,10};
        int [] arr3 = {11,10,5,14,1,7};

        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j < arr2.length ; j++) {
                for (int k = 0; k < arr3.length ; k++) {

                    if(arr1[i] == arr2[j] && arr1[i] ==arr3[k]){
                        System.out.println(arr1[i]);
                        break;
                    }

                }

            }

        }

    }
}

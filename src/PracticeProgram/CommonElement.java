package PracticeProgram;

public class CommonElement {
    public static void main(String[] args) {
        int[] arr1 = {12,23,45,3,2,45,21,1};
        int[] arr2 ={12,8,90,75,99};

        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length ; j++) {

                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }

    }
}

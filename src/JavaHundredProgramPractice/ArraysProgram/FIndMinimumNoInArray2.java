package JavaHundredProgramPractice.ArraysProgram;

public class FIndMinimumNoInArray2 {
    public static void main(String[] args) {

        int [] arr ={10,2,1,7,8,3};
        int min =arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("minimum number is: "+min);
    }
}

package JavaHundredProgramPractice.ArraysProgram;

public class LowestNoInArray4 {
    public static void main(String[] args) {

        int [] arr ={6,2,3,7,8,3,1};

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {

                int temp =0;
                if(arr[i] > arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }

        }
        System.out.println(arr[0]);
    }
}

package arryPrograms;

public class ArrayHighestNumber {
    public static void main(String[] args) {

        int[] arr ={17,9,18,20,5,6,3,1};

        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++){

                int temp =0;

                if(arr[i] > arr[j]){

                    temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

        }
        System.out.println(arr[arr.length-1]);//jar program asceding order ne kela tr otherwise it will print lowest

    }


}


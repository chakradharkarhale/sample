package practice;

public class SortingArray {
    public static void main(String[] args) {
        int []arr ={9,8,6,4,1,2,19,352};

        for (int i = 0; i < arr.length ; i++) {

            for (int j = i+1; j < arr.length ; j++) {
                int temp;
                if(arr[i]>arr[j]){

                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
            System.out.println(arr[i]);
        }

    }

}

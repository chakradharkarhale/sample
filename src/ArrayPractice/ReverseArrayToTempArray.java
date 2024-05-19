package ArrayPractice;

public class ReverseArrayToTempArray {

    public static void main(String[] args) {

        int x=0;
        int[]arr ={1,2,3,4,5,6,7,8,9};
        int[] tempArr = new int[arr.length];
        for(int i=arr.length-1;i>=0; i--){

            tempArr[x]=arr[i];
            x++;
        }

        for(int i=0;i< arr.length;i++){
            System.out.println(tempArr[i]);
        }
    }
}

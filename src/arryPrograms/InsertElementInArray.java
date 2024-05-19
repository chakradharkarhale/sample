package arryPrograms;

//program to insert element in arrays


public class InsertElementInArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        arr[2] =20; //modify the third element (index 2) from 3 to 20

       //print modified array
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}

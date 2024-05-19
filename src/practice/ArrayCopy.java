package practice;

public class ArrayCopy {

    public static void main(String[] args) {
        int [] arr1= {1,2,3,4,5,6,7};
        int [] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length ; i++) {
            arr2[i]=arr1[i];
            System.out.print( +arr2[i]);
        }

    }

}

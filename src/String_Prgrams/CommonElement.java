package String_Prgrams;

import java.sql.SQLOutput;
import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,55,56,67};
        int[] arr2 = {1,3,2,9,8,8,9,9,9};
        int[] arr3 = {1, 99};
        int[] arr4 = new int[arr1.length + arr2.length + arr3.length];
        //int count = 0;

//create temp array and temp in var temppp= 0
//        int [] temp = new int[0];
//        int tempVar=0;

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                for (int k = 0; k < arr3.length; k++) {

                    if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
//                        arr1[i];
                    //    count++;
                        System.out.println(arr1[i]);
                    }

                }

            }
        }


//            System.out.println(count);
            int count1=0;
        for (int i = 0; i < arr1.length; i++) {
            arr4[count1] = arr1[i];
            count1++;

        }
        for (int j = 0; j < arr2.length; j++) {
            arr4[count1] = arr2[j];
            count1++;
        }

        for (int k = 0; k < arr3.length; k++) {
            arr4[count1] = arr3[k];
            count1++;



        }
      System.out.println(Arrays.toString(arr4));
        int count2=0;

        for (int i = 0; i < arr4.length ; i++) {
            boolean unique = true;

            for (int j = 0; j <arr4.length ; j++) {
                if(i!=j && arr4[i]==arr4[j]){

                    count2++;
                }

            }
            if(count2>1) {
                System.out.println(arr4[i]);
            }

        }
    }
}


package arryPrograms;

//public class CommonElementInArray {
//    public static void main(String[] args) {
//
//        int Commoncount =0;
//
//        int Notcommoncount =0;
//
//        int[] arr1 ={1,2,3,4,5};
//        int [] arr2 ={2,3,8,9,6};
//        int i;
//        boolean found = false;
//        for(i=0; i<arr1.length;i++) {
//
//            for (int j = 0; j < arr2.length; j++) {
//
//                if (arr1[i] == arr2[j]) {
//                    System.out.println(arr1[i] );
//                    Commoncount++;
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) {
//                System.out.println(arr1[i] );
//                Notcommoncount++;
//            }
//
//
//        }
//        System.out.println( Commoncount);
//        System.out.println( Notcommoncount);
//       }
//}
//



 class CommonElements {
    public static void main(String[] args) {
        // Define two integer arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        // Find common elements
        System.out.println("Common elements:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                    break; // Move to the next element in array1
                }
            }
        }
    }
}



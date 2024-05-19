package ArrayPractice;
//
//public class Practice {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        //changed value without using third variable
////        System.out.println("value of a is "+a);
////
////        System.out.println("value of b is "+ b);
//
//        System.out.println(a + " "+b);
//
//    }
//}
//
//


//public class Practice {
//    public static void main(String[] args) {
//        int num = 12345;
//        int reversed = 0;
//        while (num != 0) {
//            int digit = num % 10;
//            reversed = reversed * 10 + digit;
//            num /= 10;
//        }
//        System.out.println("Reversed number = " + reversed);
//    }}



public class Practice {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        System.out.println("Elements in array1 but not in array2: ");
        for (int i = 0; i < array1.length; i++) {
            boolean found = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(array1[i]);
            }
        }

        System.out.println("Elements in array2 but not in array1: ");
        for (int i = 0; i < array2.length; i++) {
            boolean found = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(array2[i]);
            }
        }
    }
}

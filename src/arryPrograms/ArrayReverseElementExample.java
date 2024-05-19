package arryPrograms;
//given an array, store it in temporary array but in reverse order and then print all elements of temp arrayn
public class ArrayReverseElementExample {

    public static void main(String[] args) {



        int[] input = {10,9,8,7,6,5,4};
        //length = 7    0 to 6
        int[] tempArray = new int[input.length];     // 4,5,6,7,8,9,10
        int index = 0;
        for(int i = input.length - 1; i >=0; i--){
            //i = 6
            tempArray[index] = input[i];
            index++;
        }

        for(int i = 0; i < tempArray.length -1 ; i++){
            System.out.println(tempArray[i]);
        }

//        for(int i = 0; i < tempArray.length ; i++){
//            System.out.println(tempArray[i]);
//        }
//        for(int i = 0; i <= tempArray.length -1 ; i++){
//            System.out.println(tempArray[i]);
//        }
    }
}
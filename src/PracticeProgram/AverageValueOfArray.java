package PracticeProgram;

public class AverageValueOfArray {
    public static void main(String[] args) {
        int[]arr ={12,23,34,55,66,43,22,56,32};
        int sum=0;

        for (int i = 0; i < arr.length ; i++) {
            sum= sum+ arr[i];


        }
        double avg = sum/ arr.length;
        System.out.println(avg);
    }

}

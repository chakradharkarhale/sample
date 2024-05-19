package practice;

public class AvarageValueOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            sum=sum+arr[i];
        }
        double avg =sum/ arr.length;
        System.out.println(avg);
    }
}

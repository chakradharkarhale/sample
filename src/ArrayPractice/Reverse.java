package ArrayPractice;

public class Reverse {
    public static void main(String[] args) {

        int num =763883;
        int reverse=0;
        int digit;

        while(num!=0){
            digit=num%10;
            reverse=reverse*10+digit;
            num /=10;
        }
        System.out.println(reverse);

    }

}

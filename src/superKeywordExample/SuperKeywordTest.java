package superKeywordExample;
class B00{
    public B00(){
        System.out.println("Line number 5");
    }
}

class B11 extends B00{
    public B11(){
        System.out.println("This is default constructor of B11 class");
    }

    public B11(String a){
        System.out.println("Parameterized constructor of B11 "+a);
    }

    public B11(String a, int b, boolean c){
        System.out.println("line number 19  Multiple params");
    }
}

class B22 extends B11{
    public B22(){
        //super(); //in this case it won't call default constructor of parent class,
        // as we are calling parameterized constructor of parent class.
        super("Java", 100, true);
        System.out.println("This is default constructor of B22 class");
    }
}

public class SuperKeywordTest {
    public static void main(String[] args) {
        B22 b2 = new B22();   //9 17     5 17  13/22
    }
}

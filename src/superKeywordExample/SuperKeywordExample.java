package superKeywordExample;

class Test{
    public Test(){
        System.out.println("Test constructor");
    }
}

class SuperExample extends Test{
    public SuperExample(){
        System.out.println("default constructor of SuperExample class");
    }
    public SuperExample(int a){
        System.out.println("parameterised constructor of SuperExample class"+a);
    }
    public SuperExample(int a, String s){
        System.out.println("double parameterised constructor of SuperExample class");
    }


}
class SuperCall extends SuperExample{
    public SuperCall(){
        super(10,"java");
        System.out.println("this is default constructor of class SuperCall");
    }
}
public class SuperKeywordExample {
    public static void main(String[] args) {
        SuperCall obj = new SuperCall();

    }
}

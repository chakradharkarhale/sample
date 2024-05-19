package staticBlock;
//2 types of block
//1) Instance block
//2) static block

class A333{

}

class A444 extends A333{
    int a;
    public A444(){
        //first line in constructor is either call to super class default constructor or we can call
        // same class constructors but not both

        super();
        this.a = a;
        this.test();
    }

    void test(){

    }

    public A444(int a){}
}


//static block  -> main method  -> object create -> instance block -> constructor
//want to print message before main method execution starts?
public class JavaBlockConcept {
    //variable
    //
    int age;
    void test(){
        System.out.println("this is method");
    }

    /*public JavaBlockConcept(){
        System.out.println("This is Constructor");
    }*/

    public JavaBlockConcept(int a){
        System.out.println("This is parameterized ");
    }

    {
        System.out.println("This is an instance block "+age);
    }

    static {
        System.out.println("This is a static block2");
    }

    static void display(){
        System.out.println("This is static method ");
    }

    public static void main(String[] args) {
        JavaBlockConcept o = new JavaBlockConcept(10);
        JavaBlockConcept o1 = new JavaBlockConcept(10);
        System.out.println("in main method");
      //  display();

    }

}

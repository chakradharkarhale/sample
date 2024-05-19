package constructorChaining;

class AAAAAAAAAAAAA{
    public AAAAAAAAAAAAA(){
        System.out.println("Testttttttt");
    }
}

class Constructor1 extends AAAAAAAAAAAAA{
    //default/ no argument constructor
    public Constructor1(){
        System.out.println("default Constructor of Parent class");
    }

    //parameterized
    public Constructor1(int a){
        System.out.println("Constructor of class Constructor1 "+a);
    }
}

public class ConstructorChainingExample extends Constructor1{
//Imp -> the first line in any constructor is call to super class default constructor
//even if you don't add that line, compiler will add the line super();

//When we don't write any constructor in class, then compiler will provide you  default constructor.
//but if I create parameterized constructor, compiler will not provide default constructor it mean developer needs to create default constructor


    // super means parent class
    //this means current class
    public ConstructorChainingExample(){
        System.out.println("default Constructor of child class");  //
    }

    public ConstructorChainingExample(String a, int b){
        System.out.println("Parameterized Constructor of class ConstructorChainingExample1");  //
    }

    public static void main(String[] args) {
        //ConstructorChainingExample1 obj = new ConstructorChainingExample1();
        Constructor1 obj1 = new Constructor1(100);
    }
}
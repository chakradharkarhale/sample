package overridingPractice;

//1) In java, a method can only be Overridden in Subclass, not in same class. (It should be parent child relationship.)
//2) The argument list/method signature should be exactly the same as that of the overridden/parent class method.
public class Rule1 {

    void show(){
        System.out.println("parent class method");
    }
}
class Test extends Rule1{
   @Override
     void show(){
        System.out.println("child class method");
    }
}

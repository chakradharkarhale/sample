//8) A subclass within the same package as the instance’s superclass can override any superclass method that is not declared private or final.
/*For rule no 8:
Create 1 package and 2 classes(create separate java files)
-> parent class write 4 methods with 4 access modifiers
-> now try to override all these methods in child class
Parent class:*/


package methodOveriding;

public class RuleNoEight1 {

    void show(){
        System.out.print("parent clas default method");
    }

    public void show1(){
        System.out.print("parent clas public method");
    }
    private  void show12(){
        System.out.print("parent clas public method");
    }
    protected void show123(){
        System.out.print("parent clas public method");
    }
}
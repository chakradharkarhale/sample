package methodOveriding;

//5) A method declared final cannot be overridden.
public class RuleNoFiveOverriding {
    final void show(){
        System.out.print("parent class final method");
    }

}

class TestRule1 extends RuleNoFiveOverriding{
   /* @Override
    final void show(){
        System.out.print("parent class final method");
    }*/
}
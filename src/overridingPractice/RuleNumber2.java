package overridingPractice;

//if superclass method is declaired in public then overriding method in subclass cant be either private or default or protected
public class RuleNumber2 {

    public void show(){
        System.out.println("parent class public method");
    }
}

class Test1 extends RuleNumber2{
    @Override
    public void show(){
   // protected void show(){

        System.out.println("can not be use more restrictive access modifier");
    }
}
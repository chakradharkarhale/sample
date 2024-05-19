package RuleNoNineOverrideTest;

import methodOveriding.RuleNoNineOverride1;

public class RuleNoNineOverride123 extends RuleNoNineOverride1 {

//    @Override
//    void display(){
//        System.out.print("this is parent class method");
//    }
    @Override
    public void display1(){
        System.out.print("this is parent class method");
    }
//    @Override
//    private void display12(){
//        System.out.print("this is parent class method");
//    }
    @Override
    protected void display123(){
        System.out.print("this is parent class method");
    }
}

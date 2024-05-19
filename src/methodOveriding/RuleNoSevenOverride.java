package methodOveriding;

//7) If a method cannot be inherited then it cannot be overridden. Ex: private methods in super class.
public class RuleNoSevenOverride {

    private void test(){
        System.out.print("this is parent class method");

    }

    void show(){
        System.out.print("this is parent class non private method");
    }
}

class Test extends RuleNoSevenOverride{
//    @Override
//    private void test(){
//        System.out.print("this is parent class method");
//
//    }


    public static void main(String[] args) {
        RuleNoSevenOverride obj =new RuleNoSevenOverride();
        obj.show();
        //obj.test();  //not able to calling test method due to private access modifier
    }
}
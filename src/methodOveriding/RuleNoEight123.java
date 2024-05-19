
package methodOveriding;

public class RuleNoEight123 extends RuleNoEight1 {
    @Override
    void show(){
        System.out.print("parent class default method");
    }
    @Override
    public void show1(){
        System.out.print("parent clas public method");
    }
//
//    @Override
//    private  void show12(){
//        System.out.print("parent clas public method");
//    }
    @Override
    protected void show123(){
        System.out.print("parent clas public method");
    }

    public static void main(String[] args) {
        RuleNoEight1 obj = new RuleNoEight1();
        obj.show();
    }
}
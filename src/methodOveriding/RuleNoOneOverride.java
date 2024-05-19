
package methodOveriding;
//1) In java, a method can only be Overridden in Subclass, not in same class. (It should be parent child relationship.)
//2) The argument list/method signature should be exactly the same as that of the overridden/parent class method.

public class RuleNoOneOverride {
    void show(){
        System.out.print("Rule number one ");
    }

    class Test extends RuleNoOneOverride{
        @Override
        void show(){
            System.out.print("Rule number one ");
        }

    }
}
class TestMethod {
    public static void main(String[] args) {
        RuleNoOneOverride obj = new RuleNoOneOverride();
        obj.show();
    }
}
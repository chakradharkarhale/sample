package methodOveriding;

//if superclass method is declaired in public then overriding method in subclass cant be either private or default or protected
public class RuleNoFourOverride {
    public void show(){
        System.out.print("parent class method");
    }
}

class ChildClass extends RuleNoFourOverride{
    @Override
    public void show(){
        System.out.print("child class method");
    }

}

class TestRule {
    public static void main(String[] args) {
        RuleNoFourOverride obj = new RuleNoFourOverride();
        obj.show();
    }
}
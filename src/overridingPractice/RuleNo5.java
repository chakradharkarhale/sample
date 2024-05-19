package overridingPractice;

//5) A method declared final cannot be overridden.
public class RuleNo5 {

    final void show(){
        System.out.println("parent class final method");
    }
}

class Test2 extends  RuleNo5{

//    @Override
//    void show(){  //'show()' cannot override 'show()' in 'overridingPractice.RuleNo5'; overridden method is final
//        System.out.println("cant be override");
//
//    }
}


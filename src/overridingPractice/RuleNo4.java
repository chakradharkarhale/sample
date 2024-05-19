package overridingPractice;


public class RuleNo4 {

   static void show(){
       System.out.println("parent class static method");
   }
}

class Test3 extends RuleNo4{


   static void show(){
        System.out.println("child class static method");

    }
}

class Run{
    public static void main(String[] args) {
        RuleNo4.show();
        Test3.show();
    }

}

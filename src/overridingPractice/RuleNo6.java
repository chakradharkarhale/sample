package overridingPractice;

// If a method cannot be inherited then it cannot be overridden. Ex: private methods in super class.
public class RuleNo6 {

   private void show(){
       System.out.println("private method in super class");
   }

   void display(){
       System.out.println("not private method");
   }

}

class Test4 extends  RuleNo6{
//    @Override
//    private void show(){
//
//    }


}

class Run1{
    public static void main(String[] args) {
        RuleNo6 obj = new RuleNo6();

    }
}

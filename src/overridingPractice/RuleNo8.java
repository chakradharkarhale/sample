package overridingPractice;
//A subclass within same package as the instance superclass can override any superclass method that is not declared private or final
public class RuleNo8 {

     void show(){
        System.out.println("parent class default method");
    }
    public void show1(){
        System.out.println("parent class default method");
    }
    private void show2(){
        System.out.println("parent class default method");
    }
    protected void show3(){
        System.out.println("parent class default method");
    }

}

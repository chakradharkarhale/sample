package overridingPractice;

public class RuleNo8Override extends  RuleNo8 {

    @Override
    void show(){
        System.out.println("parent class default method");
    }
    @Override
    public void show1(){
        System.out.println("parent class default method");
    }
//    @Override
//    private void show2(){
//        System.out.println("parent class default method");
//    }
    @Override
    protected void show3(){
        System.out.println("parent class default method");
    }
}

package multithreading;

public class OverridingStartUsingSuperKeyword extends Thread{

    public  void  start(){
        super.start();
        System.out.println("Start method");
    }

    public void run(){
        System.out.println("run method");
    }
}

class MyThreadClass{
    public static void main(String[] args) {
        OverridingStartUsingSuperKeyword t =new OverridingStartUsingSuperKeyword();
        t.start();
        System.out.println("main method");
    }
}

package practice;

public class RunMethodOverloading extends Thread{

    @Override
    public void run(){
        System.out.println("no argument");
    }

    public void run(int a){
        System.out.println("argument ");
    }

    public static void main(String[] args) {
        RunMethodOverloading t = new RunMethodOverloading();
        t.start();
        t.run(10);
    }
}


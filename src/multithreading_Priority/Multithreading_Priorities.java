package multithreading_Priority;

public class Multithreading_Priorities extends Thread{
    @Override
    public  void run(){
        System.out.println();
        System.out.println("child thread");
        System.out.println("child thread priority"+Thread.currentThread().getPriority());

    }
    public static void main(String [] args){
        System.out.println("main thread old priority"+Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        System.out.println("main thread new priority"+Thread.currentThread().getPriority());

        Multithreading_Priorities t = new Multithreading_Priorities();
        t.start();
    }


}

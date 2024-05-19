package multithreading_Priority;

public class DefaultPriority extends Thread{
    @Override
    public void run(){
        System.out.println("run method");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(9);

       // DefaultPriority t = new DefaultPriority();
       // System.out.println(t.getPriority());
        // OR
        System.out.println(Thread.currentThread().getPriority());
    }


}

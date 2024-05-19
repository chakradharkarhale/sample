package multithreading;

public class ImplementRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("run method: ");
    }
}

class Test1{
    public static void main(String[] args) {
        ImplementRunnable r = new ImplementRunnable();
        Thread t = new Thread(r);
        t.start();
        //t.run();
    }
}

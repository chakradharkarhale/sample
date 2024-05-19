package multithreading.InterruptingThread;

public class InterruptMethod extends Thread{
    @Override
    public void run(){
        try{
            for (int i = 0; i <5 ; i++) {
                System.out.println("i am lazy thread:"+ i);
                Thread.sleep(2000);

            }
        }catch (InterruptedException e){
            System.out.println("i got interrupted");
        }
    }
}

class MyThread{
    public static void main(String[] args) {
        InterruptMethod t = new InterruptMethod();
        t.start();
        t.interrupt();
        System.out.println("end of main thread");
    }

}


package multithreading_Priority;

public class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("child Thread");

        }
    }
}

class ThreadPriorityDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
      //  t.setPriority(10);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main Thread");

        }
    }
}

package multithreading;

public class ExtendThreadclass extends Thread{

   @Override
    public void run(){
       System.out.println("run method");
    }

    }

    class Test{
        public static void main(String[] args) {
            ExtendThreadclass t = new ExtendThreadclass();
            t.start();
           // t.run();
        }
    }


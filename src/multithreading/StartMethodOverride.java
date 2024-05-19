package multithreading;
/*
if we are overriding start() method then our start() method will be executed just like normal method call,
 and no new thread will be started
 */
public class StartMethodOverride extends Thread{


        public void start(){
            System.out.println("start method");
        }

        public void run(){
            System.out.println("run method");
        }
    }

    class MyThread2{
        public static void main(String[] args) {
            NotOverridingRunMethod t = new NotOverridingRunMethod();
            t.start();
            System.out.println("main method");
        }
    }























































































































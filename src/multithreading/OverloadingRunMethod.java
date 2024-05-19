package multithreading;

/*
Overloading run method is possible but thread class start() method always call no argument run method
the other overloaded run method we have to call explicitly then only it will be executed just like normal method.
 */
public class OverloadingRunMethod extends Thread{

    @Override
    public void run() {
        System.out.println("no-arg run method");
    }

    public void run(int a) {
        System.out.println("int-arg run method");
    }
}

class MyThread {
    public static void main(String[] args) {
        OverloadingRunMethod t= new OverloadingRunMethod();
        t.start();
    }
}

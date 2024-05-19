package multithreading;

/*
if we are not override run() method then thread class run method will be executed which has empty implementation,
and hence we want get any output
 */
public class NotOverridingRunMethod extends Thread {

    }


class MyThread1{
    public static void main(String[] args) {
        NotOverridingRunMethod t = new NotOverridingRunMethod();
            t.start();

    }
}





















































































































package multithreading.ThreadPreventionMethods;

public class YieldMethod extends Thread{
    @Override
    public void run(){
        if(Thread.currentThread().getName().equals("parent")) {
            for (int i = 0; i < 5; i++) {
                System.out.println("parent Thread " + i);
            }
        }

        if(Thread.currentThread().getName().equals("child")) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread " + i);
            }

        }}



    public static void main(String[] args) {
        YieldMethod t = new YieldMethod();
        t.setName("parent");
        t.start();
        Thread.yield();

        YieldMethod t1 = new YieldMethod();
        t1.setName("child");

        t1.start();


        }
    }


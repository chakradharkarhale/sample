package multithreading;

public class GettingAndSettingNameOfThread  extends Thread{

}

class MyThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()); //main
        GettingAndSettingNameOfThread t = new GettingAndSettingNameOfThread();

        System.out.println(t.getName()); //Thread-0

        Thread.currentThread().setName("chakradhar");
        System.out.println(Thread.currentThread().getName());//chakradhar

    }
}

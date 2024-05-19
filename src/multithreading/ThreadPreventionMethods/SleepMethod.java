package multithreading.ThreadPreventionMethods;

public class SleepMethod extends  Thread{
    @Override
    public void run(){
        for (int i = 1; i <=5 ; i++) {

            try {
               Thread.sleep(2000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SleepMethod t = new SleepMethod();
        t.start();
       // t.run();
    }
}

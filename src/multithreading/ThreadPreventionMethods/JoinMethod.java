package multithreading.ThreadPreventionMethods;

public class JoinMethod extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("child thread");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }

        }
    }
    }
    class JoinMethodDemo{
        public static void main(String[] args) throws InterruptedException {
            JoinMethod t = new JoinMethod();
            t.start();
            t.join();
            for (int i = 0; i <5 ; i++) {
                System.out.println("main thread");

            }
        }
    }






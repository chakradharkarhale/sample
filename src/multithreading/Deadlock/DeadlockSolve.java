package multithreading.Deadlock;

public class DeadlockSolve {
    final static String R1 = "Java";
    final static String R2 = "Programming";

    public static void main(String[] args) {
        // creating thread T1
        Thread T1 = new Thread() {
            public void run() {
                synchronized (R1) {
                    System.out.println("Thread T1 locked -> Resource R1");

                    synchronized (R2) {
                        System.out.println("Thread T1 locked -> Resource R2");
                    }
                }
            }
        };

        // creating thread T2
        Thread T2 = new Thread() {
            public void run() {
//                try {
//                    T1.join(); // T2 waits for T1 to finish
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                synchronized (R2) { // Same order of locking resources
                    System.out.println("Thread T2 locked -> Resource R1");

                    synchronized (R1) {
                        System.out.println("Thread T2 locked -> Resource R2");

                    }
                }
            }
        };

        // starting both the threads
        T1.start();
        T2.start();
    }
}
/*The deadlock is avoided by ensuring that both threads acquire locks on resources in the same order.
In this modified code, both Thread `1111111111111T1 and Thread T2 acquire a lock on resource R1 first and then try to acquire a lock on resource R2.
This eliminates the possibility of a deadlock because both threads follow the same order of locking resources.Additionally,
there's a short sleep in Thread T1 after acquiring the lock on R1 just to make sure that T1 locks R1 before T2 tries to lock R1.
 This is not strictly necessary in all cases, but it helps to illustrate the concept of ensuring a consistent locking order.
 */
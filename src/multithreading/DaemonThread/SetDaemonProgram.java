package multithreading.DaemonThread;

public class SetDaemonProgram extends  Thread{

    @Override
    public void run(){
        System.out.println("run method");
    }

    public static void main(String[] args) {
        SetDaemonProgram t = new SetDaemonProgram();
        t.setDaemon(true);
        t.start();
        System.out.println("Daemon thread set");

    }
}

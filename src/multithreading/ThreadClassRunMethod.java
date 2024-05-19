package multithreading;

public class ThreadClassRunMethod extends Thread{

}

class Java{
    public static void main(String[] args) {
        ThreadClassRunMethod t = new ThreadClassRunMethod();
        t.start();
    }
}

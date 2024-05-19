package multithreading;
/* STEPS
1) extend thread class
2)override run() method
3)create object of class
4)start the thread by using start() method.
*/
public class ExtendingThreadClass extends  Thread { //extend Thread class

    @Override
    public void run() { //override run method

        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
        }


    }
    //for making thread owner of that object.

//    synchronized void  show() throws InterruptedException {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("show thread");
//            wait(2002);
//        }
//}

    }


class ThreadDemo{
    public static void main(String[] args) throws InterruptedException {

        ExtendingThreadClass obj = new ExtendingThreadClass(); // create obect of class
        obj.start(); //start the thread by using start() method.
       // obj.show();

        for (int i = 0; i <5 ; i++) {
            System.out.println("main Thread");

        }
    }
}

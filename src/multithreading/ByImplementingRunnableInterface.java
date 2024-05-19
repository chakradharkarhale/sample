package multithreading;

public class ByImplementingRunnableInterface implements Runnable { // implement runnable interface
        @Override
        public void run(){  //override run method
            System.out.println("run method");

        }

    public static void main(String[] args) {
        ByImplementingRunnableInterface r = new ByImplementingRunnableInterface(); //create object of class

        Thread th1 = new Thread(); // new thread will be created which is responsible for execution of thread class run() method,
        //does not get output

        Thread th = new Thread(r); // create object of thread class
        //new thread will be created which is responsible for execution of ByImplementingRunnableInterface run() method,
        // will get output


        th.start();  // start thread class start() method
      //  r.start() // get compile time error saying start not available in ByImplementingRunnableInterface class

        r.run();//no new thread will be crerated and ByImplementingRunnableInterface run method executed like normal method.
    }
    }




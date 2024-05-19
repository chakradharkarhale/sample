package multihreadingSynchronization;

class BookTheaterSeat{

   static int total_seats=20; //  ihe pn int chya agodr static dyaych

   static synchronized void bookSeat(int seats){ //static synchronized keyword use kraych
        if(total_seats>=seats){
            System.out.println("seat booked successfully:"+seats);
            total_seats=total_seats-seats;
            System.out.println("seat left:"+total_seats);
        }
        else {
            System.out.println("seat can not be booked:");
            System.out.println("seat left:"+total_seats);
        }
    }
}

class MyThread1 extends Thread {

    BookTheaterSeat b;
    int seats;
    MyThread1(BookTheaterSeat b, int seats) {
     this.b=b;
     this.seats=seats;
    }
    @Override
    public void run(){
        b.bookSeat(seats);
    }
}

class MyThread2 extends Thread {

    BookTheaterSeat b;
    int seats;
    MyThread2(BookTheaterSeat b, int seats) {
        this.b=b;
        this.seats=seats;
    }
    @Override
    public void run(){
        b.bookSeat(seats);
    }
}

public class StaticSynchronization {
    public static void main(String[] args) {
        BookTheaterSeat b1 = new BookTheaterSeat();
        MyThread1 t1 = new MyThread1(b1,7);
        t1.start();

        MyThread2 t2=new MyThread2(b1,6);
        t2.start();




        BookTheaterSeat b2 = new BookTheaterSeat();
        MyThread1 t3= new MyThread1(b2,5);
        t3.start();

        MyThread2 t4=new MyThread2(b1,9);
        t4.start();

    }



}

package multihreadingSynchronization;

public class BookTheaterSeatWithSynchronized {
    int total_seats=10;

    synchronized void bookSeat(int seats){
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
class MovieBookApplication extends Thread{
   static   BookTheaterSeatWithSynchronized b;
   int seats;

    @Override
    public void run(){
        b.bookSeat(seats);

    }

    public static void main(String[] args) {
    b = new BookTheaterSeatWithSynchronized();
        MovieBookApplication obj = new MovieBookApplication();
        obj.seats=7;
        obj.start();

        MovieBookApplication obj1 = new MovieBookApplication();
        obj1.seats=6;
        obj1.start();



    }
}

package multihreadingSynchronization;

public class BookTheaterSeatWithoutSynchronized {
    int total_seats=10;

     void  bookseat(int seats){
        if(total_seats>=seats){
            System.out.println("seat book successfully:"+seats);

            total_seats =total_seats-seats;
            System.out.println("seat left:"+total_seats);
        }
        else {
            System.out.println("seat can not be booked");
            System.out.println("seat left:"+total_seats);
        }
    }
}

class MovieBookApp extends  Thread{
    static BookTheaterSeatWithoutSynchronized b;
    int seats;
    @Override
    public void run(){
        b.bookseat( seats);

    }

    public static void main(String[] args) {
        b= new BookTheaterSeatWithoutSynchronized();
        MovieBookApp obj = new MovieBookApp();
        obj.seats=7;
        obj.start();

        MovieBookApp obj1 = new MovieBookApp();
        obj1.seats=6;
        obj1.start();


    }

}
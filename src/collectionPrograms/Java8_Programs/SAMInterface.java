package collectionPrograms.Java8_Programs;

//public interface SAMInterface {
//
//    void display();
//
//}
//class Test {
//    public static void main(String[] args) {
//            SAMInterface samInterface = () -> {
//                System.out.println("lambda expression ");
//            };
//            samInterface.display();
//        }
//    }
//


    public  interface SAMInterface  {
        void show();
}

interface soni{
        void  show();
}

 class Test implements SAMInterface,soni{
    // @Override
     public void show() {

         System.out.println("show method");

     }
 }

 class TestShow{
     public static void main(String[] args) {
         Test test = new Test();
        test.show();

     }
 }
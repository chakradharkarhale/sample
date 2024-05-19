package collectionPrograms.Java8_Programs;

 interface TestDiamond{
     default void Display(){
         System.out.println("TestDiamond interface display method");
    }
}

interface DiamondExample{
    default void Display(){
        System.out.println("DiamondExample interface display method");
    }
}
public class DiamondProblemSolution implements TestDiamond, DiamondExample {

     @Override
    public void Display(){
         TestDiamond.super.Display();
       //  DiamondExample.super.Display(); //if you want to add only one method then cmt this line



     }
}

class Main{
    public static void main(String[] args) {
        DiamondProblemSolution obj = new DiamondProblemSolution();
        obj.Display();
    }
}





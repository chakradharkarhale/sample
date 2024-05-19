package collectionPrograms.Java8_Programs.lambdaExpressionProgram;

interface  Addition{
  void  sum (int a, int b);
}

public class SUmOfTwoInteger1 {
    public static void main(String[] args) {
        Addition obj = (a,b)->{
            System.out.println(a+b);
        };
        obj.sum( 10 ,20);
    }
}

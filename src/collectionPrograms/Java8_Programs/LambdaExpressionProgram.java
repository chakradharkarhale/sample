package collectionPrograms.Java8_Programs;

@FunctionalInterface
interface  TestLambdaExpression {

    public void show(int x);

    default public void display(){
        System.out.println("default method: ");
    }

}
public class LambdaExpressionProgram {
    public static void main(String[] args) {
        TestLambdaExpression obj = (int x) -> System.out.println(2*x);

     //   TestLambdaExpression obj1 =  x -> System.out.println(2*x);   //if we have single parameter
        obj.show(5);
    }



}

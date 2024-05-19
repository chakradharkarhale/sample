package collectionPrograms.Java8_Programs;

public interface LambdaExpression {

    void show(int a, int b);
}

class TestLambda{
    public static void main(String[] args) {
        LambdaExpression lambdaExpression =( a, b) ->{
            System.out.println(a + b);
        };
        lambdaExpression.show(10,20);
    }

}
